package com.example.demo.grpc.server;

import com.example.demo.grpc.*;
import io.grpc.stub.StreamObserver;

public class ProtoTestServiceImpl extends TextServiceGrpc.TextServiceImplBase {

	@Override
	public void protoTest(TextRequest request, StreamObserver<TextResponse> responseObserver) {
		TextMessage reqTextMsg = request.getReqTextMsg();
		
		System.out.println("Text from client : " + reqTextMsg.getText());
		
		TextMessage resTextMsg = TextMessage.newBuilder()
											.setText("Hello " + reqTextMsg.getText())
											.build();
		
		TextResponse response = TextResponse.newBuilder()
											.setResTextMsg(resTextMsg)
											.build();
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
	
}
