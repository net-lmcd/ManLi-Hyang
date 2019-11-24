package com.example.demo.grpc.server;

import com.example.demo.GrpcMavenExampleApplication;
import com.example.demo.dao.TestDao;
import com.example.demo.dto.TestDto;
import com.example.demo.grpc.*;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;

public class UserTestServiceImpl extends UserServiceGrpc.UserServiceImplBase {

    @Autowired
    TestDao testDao;

    @Override
    public void userTest(UserRequest request, StreamObserver<UserResponse> responseObserver) {
        UserMessage reqTextMsg = request.getReqTextMsg();

        System.out.println("userTest!");

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

       // TestDto dto = new TestDto(reqTextMsg.getId(), reqTextMsg.getUserId(), reqTextMsg.getPw(), reqTextMsg.getImageUrl());
       // testDao.InsertTest(dto);

        System.out.println("testDao : " + testDao);
     //   System.out.println("testDao : " + testDao.TestList().toString());
/*
        for(int i=0; i<testDao.TestList().size(); i++) {
            System.out.println(testDao.TestList().get(i).getId());
            System.out.println(testDao.TestList().get(i).getUser_id());
            System.out.println(testDao.TestList().get(i).getPw());
            System.out.println(testDao.TestList().get(i).getImg_url());
        }
*/
        UserResponse response = UserResponse.newBuilder()
                .setResTextMsg(resTextMsg)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
