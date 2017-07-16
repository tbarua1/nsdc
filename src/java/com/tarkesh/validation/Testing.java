/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarkesh.validation;

import com.tarkesh.operation.Operations;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.codehaus.jackson.map.ObjectMapper;


/**
 *
 * @author Abhishek.Sehgal
 */
public class Testing {
    public static void main(String[] args) throws IOException {
        Object[] allSSCJSON = Operations.getAllSSCJSON();
        for(Object o:allSSCJSON){
        System.out.println(o);
        }
    }
}
