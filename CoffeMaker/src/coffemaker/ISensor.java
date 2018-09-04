/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffemaker;
//import DSensor;
/**
 *
 * @author JorgeFlores
 */
public interface ISensor {
    public void setState(DSensorState a);
    public DSensorState getState();

}
