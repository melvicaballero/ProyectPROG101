/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffemaker;

/**
 *
 * @author JorgeFlores
 */
public abstract class DigitalSensor {
    public abstract DSensorState  getState();
    public abstract void setState(DSensorState a);


}
