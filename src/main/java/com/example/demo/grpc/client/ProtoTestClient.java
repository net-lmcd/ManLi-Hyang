package com.example.demo.grpc.client;


import com.example.demo.grpc.TextMessage;
import com.example.demo.grpc.TextRequest;
import com.example.demo.grpc.TextResponse;
import com.example.demo.grpc.TextServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ProtoTestClient {

	public static void main(String[] args) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8888)
														.usePlaintext()
														.build();
		
		TextServiceGrpc.TextServiceBlockingStub blockingStub = TextServiceGrpc.newBlockingStub(channel);
		
		System.out.println("gRPC client connected to gRPC server");
		TextMessage textMsg = TextMessage.newBuilder()
										.setText("World gRPC KTJ!")
										.build();
		
		TextRequest request = TextRequest.newBuilder()
										.setReqTextMsg(textMsg)
										.build();
		
		TextResponse response = blockingStub.protoTest(request);
		
		System.out.println("server reponse: " + response.getResTextMsg().getText());
		
		channel.shutdown();
		System.out.println("gRPC client shutdown");
	}
}
