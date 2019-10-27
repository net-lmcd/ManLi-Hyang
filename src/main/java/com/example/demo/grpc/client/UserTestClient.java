package com.example.demo.grpc.client;

import com.example.demo.grpc.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class UserTestClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8888)
                .usePlaintext()
                .build();

        UserServiceGrpc.UserServiceBlockingStub blockingStub = UserServiceGrpc.newBlockingStub(channel);

        System.out.println("gRPC client connected to gRPC server");
        UserMessage userMsg = UserMessage.newBuilder()
                .setId(1)
                .setUserId("xowns9418")
                .setPw("9418")
                .setImageUrl("http://image")
                .build();

        UserRequest request = UserRequest.newBuilder()
                .setReqTextMsg(userMsg)
                .build();

        UserResponse response = blockingStub.userTest(request);

        System.out.println("server reponse: " + response.getResTextMsg().getId());
        System.out.println("server reponse: " + response.getResTextMsg().getUserId());
        System.out.println("server reponse: " + response.getResTextMsg().getPw());
        System.out.println("server reponse: " + response.getResTextMsg().getImageUrl());

        channel.shutdown();
        System.out.println("gRPC client shutdown");
    }
}
