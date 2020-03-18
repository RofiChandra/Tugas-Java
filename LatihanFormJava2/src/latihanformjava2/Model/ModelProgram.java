/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanformjava2.Model;

/**
 *
 * @author hd
 */
public class ModelProgram {
    public String label = "Please put your information to get the result";
    
    public String returnGenderNoun(String gender){
        String noun = "He";
        
        if(gender.toLowerCase().equals("female")){
            noun = "She";
        }
        
        return noun;
    }
    
    public  String returnMental(String mental){
        switch(mental){
            case ":)" :
                    return "Smilling";
            case ":D" :
                return "Happy";
            case ":(" :
                return "Sad";
            case ":'(" :
                return "Crying";
            default:
                return "In Love";
        }
    }
}
