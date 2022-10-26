package org_testing.runner;

import java.io.IOException;

import Org.testing.testCase.TC1_PostReq;
import Org.testing.testCase.getallrec;

public class trigger
{

	
	public static void main(String[] args) throws IOException {
		TC1_PostReq tc1=new TC1_PostReq();
		tc1.testcase1();
		
		getallrec tc2=new getallrec();
		tc2.testcase2();
	}
}
