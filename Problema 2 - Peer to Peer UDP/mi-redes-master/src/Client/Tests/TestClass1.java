/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.Tests;

import java.io.IOException;

/**
 *
 * @author dcandrade
 */
public class TestClass1 {
    public static void main(String[] args) throws IOException {
        ClientTestModel c = new ClientTestModel("daniel", "12345", "localhost");
        c.start();
    }
}
