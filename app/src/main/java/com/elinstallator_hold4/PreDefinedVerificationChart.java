package com.elinstallator_hold4;

import androidx.fragment.app.Fragment;

import com.elinstallator_hold4.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class PreDefinedVerificationChart extends VerificationChart {

    //Array with group, question no, answer. answer is: -1 = not filled, 0 = yes, 1 = no, 2 = NA (not applicable)
    boolean answer[][][] = new boolean[10][15][4];
    // int answersGQA[][][] = new int[10][20][4];


    //1. Gennerelt
    String text1 = "1. Gennerelt:";

    String question1_1 = "Er der taget hensyn til ydre påvirkninger og anvendt korrekt kapslingsklasse?";
    String question1_2 = "Er der brandtætnet ved gennemføringer?";
    String question1_3 = "Er installationen isolationsprøvet?";
    String question1_4 = "Er der foretaget polaritetsprøve og kontrol af fasefølgen?";
    String question1_5 = "Er der foretaget funktionsprøver af installationen?";
    String question1_6 = "Er nul- og beskyttelsesledere korrekt identificeret?";
    String question1_7 = "Er ledere korrekt overstrømsbeskyttet og valgt efter strømværdi?";
    String question1_8 = "Er SPD’er (overspændingsbeskyttelsesudstyr) korrekt valgt og installeret?";
    String question1_9 = "Er permanent tilsluttede brugsgenstande egnet til den pågældende anvendelse?";
    String question1_10 = "Er nødvendig dokumentation til stede?";
    String question1_11 = "Er spændingsfald kontrolleret?";
    String question1_12 = "Er der foretaget foranstaltninger mod elektromagnetiske påvirkninger?";
    String question1_13 = "Er ejer/bruger informeret om funktion og betjening?";



    //2. Tavlen

    String text2 = "2. Tavlen:";

    String getQuestion2_1 = "Er der tilstrækkelig plads til at arbejde på/adgang til tavlen?";
    String getQuestion2_2 = "Er overstrømsbeskyttelsesudstyr korrekt valgt og evt. indstillet?";
    String getQuestion2_3 = "Er der en entydig mærkning af beskyttelsesudstyr med tilhørsforhold?";
    String getQuestion2_4 = "Er der mærkning om max. mærke-/indstillingsstrøm?";
    String getQuestion2_5 = "Er mærkning med oplysninger om tekniske data for tavlen foretaget?";
    String getQuestion2_6 = "Er udgående beskyttelsesledere anbragt i separate klemmer i tavlen?";
    String getQuestion2_7 = "Er afdækning og dækplader monteret?";
    String getQuestion2_8 = "Er indføringer tilpasset/tætnet, så tavlens kapslingsklasse er som mærket?";

    //3. Installationen
    String text3 = "3. Installation:";

    String getQuestion3_1 = "Er udstyr til adskillelse og afbrydelse korrekt valgt, placeret og installeret?";
    String getQuestion3_2 = "Er stikkontakter og udtag m.m. installeret i henhold til gældende bestemmelser?";
    String getQuestion3_3 = "Er kabler/ledninger korrekt oplagt, afsluttet og forbundet?";
    String getQuestion3_4 = "Er kabler beskyttet mod mekanisk overlast ved opføringer fra gulv/jord?";
    String getQuestion3_5 = "Er tilledninger aflastet for træk og vridning ved tilslutning til installationen?";
    String getQuestion3_6 = "Er alle dæksler og afdækninger monteret, så der ikke er berøringsfare?\n";
    String getQuestion3_7 = "Er alle samlinger let tilgængelige?";

    //4. Indbygningsamaturer
    String text4 = "4. Indbygningsarmaturer:";

    String getQuestion4_1 = "Er indbygningsarmaturer korrekt valgt og monteret?";
    String getQuestion4_2 = "Er indbygningsarmaturer installeret således, at overophedning undgås?";

    //5. Beskyttelsesledere
    String text5 = "5. Beskyttelsesledere og udligningsforbindelser:";

    String getQuestion5_1 = "Er jordingslederen korrekt valgt (minimum 6 mm2)?";
    String getQuestion5_2 = "Er der etableret beskyttende potentialudligning?";
    String getQuestion5_3 = "Er supplerende beskyttende potentialudligning etableret?";
    String getQuestion5_4 = "Er den gennemgående forbindelse i udligningsforbindelser kontrolleret?";
    String getQuestion5_5 = "Er den gennemgående forbindelse i beskyttelsesledere kontrolleret?";
    String getQuestion5_6 = "Er overgangsmodstand for jordelektroden kontrolleret?";

    //6. Fejlbeskyttelse/suplerende beskyttelse
    String text6 = "6. Fejlbeskyttelse/supplerende beskyttelse:";

    String getQuestion6_1 = "Er beskyttelsesmetode korrekt valgt i forhold til installationstype og systemjording?";
    String getQuestion6_2 = "Er RCD’er (fejlstrømsafbrydere) kontrolleret og afprøvet?";
    String getQuestion6_3 = "Er klasse I brugsgenstande tilsluttet til beskyttelseslederen?";

    //Måleresultater
    String text = "Måleresultater" +
            "Her kan anføres relevante kredsdetaljer og måleresultater i forbindelse med idriftsættelse af installationen. ";
    //Kredsdetaljer

    //Afprøvning af RCD'er

    //Kortslutningsstrøm


    public PreDefinedVerificationChart() { //todo include costumer name and adress etc

        questions.add(question1_1);
        questions.add(question1_2);
        questions.add(question1_3);
        questions.add(question1_4);
        questions.add(question1_5);
        questions.add(question1_6);
        questions.add(question1_7);
        questions.add(question1_8);
        questions.add(question1_9);
        questions.add(question1_10);
        questions.add(question1_11);
        questions.add(question1_12);
        questions.add(question1_13);
        questions.add(getQuestion2_1);
        questions.add(getQuestion2_2);
        questions.add(getQuestion2_3);
        questions.add(getQuestion2_4);
        questions.add(getQuestion2_5);
        questions.add(getQuestion2_6);
        questions.add(getQuestion2_7);
        questions.add(getQuestion2_8);
        questions.add(getQuestion3_1);
        questions.add(getQuestion3_2);
        questions.add(getQuestion3_3);
        questions.add(getQuestion3_4);
        questions.add(getQuestion3_5);
        questions.add(getQuestion3_6);
        questions.add(getQuestion3_7);
        questions.add(getQuestion4_1);
        questions.add(getQuestion4_2);
        questions.add(getQuestion5_1);
        questions.add(getQuestion5_2);
        questions.add(getQuestion5_3);
        questions.add(getQuestion5_4);
        questions.add(getQuestion5_5);
        questions.add(getQuestion5_6);
        questions.add(getQuestion6_1);
        questions.add(getQuestion6_2);
        questions.add(getQuestion6_3);

    }

    public boolean[][][] getAnswer() {
        return answer;
    }

    public void setAnswer(boolean[][][] answer) {
        this.answer = answer;
    }


    public String getText1() {
        return text1;
    }

    public String getQuestion1_1() {
        return question1_1;
    }

    public String getQuestion1_2() {
        return question1_2;
    }

    public String getQuestion1_3() {
        return question1_3;
    }

    public String getQuestion1_4() {
        return question1_4;
    }

    public String getQuestion1_5() {
        return question1_5;
    }

    public String getQuestion1_6() {
        return question1_6;
    }

    public String getQuestion1_7() {
        return question1_7;
    }

    public String getQuestion1_8() {
        return question1_8;
    }

    public String getQuestion1_9() {
        return question1_9;
    }

    public String getQuestion1_10() {
        return question1_10;
    }

    public String getQuestion1_11() {
        return question1_11;
    }

    public String getQuestion1_12() {
        return question1_12;
    }

    public String getQuestion1_13() {
        return question1_13;
    }

    public String getText2() {
        return text2;
    }

    public String getGetQuestion2_1() {
        return getQuestion2_1;
    }

    public String getGetQuestion2_2() {
        return getQuestion2_2;
    }

    public String getGetQuestion2_3() {
        return getQuestion2_3;
    }

    public String getGetQuestion2_4() {
        return getQuestion2_4;
    }

    public String getGetQuestion2_5() {
        return getQuestion2_5;
    }

    public String getGetQuestion2_6() {
        return getQuestion2_6;
    }

    public String getGetQuestion2_7() {
        return getQuestion2_7;
    }

    public String getGetQuestion2_8() {
        return getQuestion2_8;
    }


    public String getText3() {
        return text3;
    }

    public String getGetQuestion3_1() {
        return getQuestion3_1;
    }

    public String getGetQuestion3_2() {
        return getQuestion3_2;
    }

    public String getGetQuestion3_3() {
        return getQuestion3_3;
    }

    public String getGetQuestion3_4() {
        return getQuestion3_4;
    }

    public String getGetQuestion3_5() {
        return getQuestion3_5;
    }

    public String getGetQuestion3_6() {
        return getQuestion3_6;
    }

    public String getGetQuestion3_7() {
        return getQuestion3_7;
    }



    public String getText4() {
        return text4;
    }

    public String getGetQuestion4_1() {
        return getQuestion4_1;
    }

    public String getGetQuestion4_2() {
        return getQuestion4_2;
    }


    public String getText5() {
        return text5;
    }

    public String getGetQuestion5_1() {
        return getQuestion5_1;
    }

    public String getGetQuestion5_2() {
        return getQuestion5_2;
    }

    public String getGetQuestion5_3() {
        return getQuestion5_3;
    }

    public String getGetQuestion5_4() {
        return getQuestion5_4;
    }

    public String getGetQuestion5_5() {
        return getQuestion5_5;
    }

    public String getGetQuestion5_6() {
        return getQuestion5_6;
    }


    public String getText6() {
        return text6;
    }

    public String getGetQuestion6_1() {
        return getQuestion6_1;
    }

    public String getGetQuestion6_2() {
        return getQuestion6_2;
    }

    public String getGetQuestion6_3() {
        return getQuestion6_3;
    }


    public String getText() {
        return text;
    }

}