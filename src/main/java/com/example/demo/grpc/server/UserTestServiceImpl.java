package com.example.demo.grpc.server;

import com.example.demo.grpc.*;
import io.grpc.stub.StreamObserver;

public class UserTestServiceImpl extends UserServiceGrpc.UserServiceImplBase {

    @Override
    public void userTest(UserRequest request, StreamObserver<UserResponse> responseObserver) {
        UserMessage reqTextMsg = request.getReqTextMsg();

        System.out.println("Text from client : " + reqTextMsg.getId());
        System.out.println("Text from client : " + reqTextMsg.getUserId());
        System.out.println("Text from client : " + reqTextMsg.getPw());
        System.out.println("Text from client : " + reqTextMsg.getImageUrl());

        UserMessage resTextMsg = UserMessage.newBuilder()
                .setId(reqTextMsg.getId())
                .setUserId(reqTextMsg.getUserId())
                .setPw(reqTextMsg.getPw())
                .setImageUrl(reqTextMsg.getImageUrl())
                .build();

        UserResponse response = UserResponse.newBuilder()
                .setResTextMsg(resTextMsg)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
