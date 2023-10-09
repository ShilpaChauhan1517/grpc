package com.bootcamp.orchestrator.requestbuilder;

import com.bootcamp.orchestrator.util.GetTransactionDetail;
import com.bootcamp.orchestrator.util.RequestHeaderCodeUtil;
import com.grpcAssignment.GetDataRequest;
import com.grpcAssignment.Pan;
import com.grpcAssignment.Pii;
import com.grpcAssignment.RequestHeader;
import com.bootcamp.grpc.orchestrator.proto.OrchestratorRequest;

public class GetDataRequestBuilder {
    public static GetDataRequest buildGetDataRequest(OrchestratorRequest request) {

        String transactionId = GetTransactionDetail.generateTransactionId();
        String productCode = RequestHeaderCodeUtil.getProductCode();
        String memberCode = RequestHeaderCodeUtil.getMemberCode();

        RequestHeader requestHeader = RequestHeader.newBuilder()
                .setTransactionId(transactionId)
                .setMemberCode(memberCode)
                .setProductCode(productCode)
                .setMonitoringDate(request.getMonitoringDate())
                .build();

        Pan pan = Pan.newBuilder()
                .setPanNumber(request.getPii().getPan().getPanNumber())
                .build();

        Pii pii = Pii.newBuilder()
                .setPan(pan)
                .build();

        return GetDataRequest.newBuilder()
                .setRequestHeader(requestHeader)
                .setPii(pii)
                .build();
    }
}