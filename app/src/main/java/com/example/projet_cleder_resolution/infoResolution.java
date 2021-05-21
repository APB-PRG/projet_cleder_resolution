package com.example.projet_cleder_resolution;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class infoResolution  implements Serializable{

        private Map<Integer, String[]> mesure= new HashMap<>();
        private  Map<Integer, String[]> gain = new HashMap<>();

        public Map<Integer, String[]> getMesure() {
            return mesure;
        }

        public Map<Integer, String[]> getGain() {
            return gain;
        }

        public void addNewMesure(String mesureAjout, String valeur){
            String[] m = {mesureAjout, valeur};

            mesure.put(mesure.size()+1, m );
        }

        public void addNewGain(String gainAjout, String valeur){
            String[] g = {gainAjout, valeur};
            gain.put(mesure.size()+1, g);
        }





    }


