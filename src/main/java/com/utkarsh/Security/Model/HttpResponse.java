package com.utkarsh.Security.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class HttpResponse {


    private int httpStatusCode;
    private HttpResponse response;
    private String reason;
    private String message;

    /*
     HttpStatuscode : 200
     HttpResponse : OK
     Reason: "Nothing to do"
     Message: "Successfully fetched"

     */



}
