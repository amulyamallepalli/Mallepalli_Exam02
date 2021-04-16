/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4Example2;

/**
 *
 * @author Amulya Mallepalli
 */
public class SoundSystems extends  ElectronicItems{
    private String earplugs;

    public SoundSystems(String earplugs,String phones) {
        super(phones);
        this.earplugs = earplugs;
    }

    public String getEarplugs() {
        return earplugs;
    }

    public void setEarplugs(String earplugs) {
        this.earplugs = earplugs;
    }

    @Override
    public String toString() {
        return "SoundSystems[" + "earplugs=" + earplugs + ']';
    }
    
    
}
