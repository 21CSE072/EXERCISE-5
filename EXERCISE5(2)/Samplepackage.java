/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplepackage;
import samplepackage.pack1.*;
import samplepackage.pack2.*;
import samplepackage.pack3.*;
public class Samplepackage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pack1program obj=new pack1program();
        pack2program obj1=new pack2program();
        pack3program obj2=new pack3program();
        obj.display();
        obj1.display();
        obj2.display();
    }
}
