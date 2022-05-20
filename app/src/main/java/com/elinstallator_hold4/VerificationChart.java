package com.elinstallator_hold4;

public class VerificationChart {

    //Installation information
    String costumerName;
    String address;
    String zip;
    String city;
    String orderNo;
    String identificationOfResponsible;
    String installationMadeBy;
    String verificationMadeBy;
    String Date;

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

    int answer1[][];
    int answer1_1;
    int answer1_2;
    int answer1_3;
    int answer1_4;
    int answer1_5;
    int answer1_6;
    int answer1_7;
    int answer1_8;
    int answer1_9;
    int answer1_10;
    int answer1_11;
    int answer1_12;
    int answer1_13;


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

    int answer2_1;
    int answer2_2;
    int answer2_3;
    int answer2_4;
    int answer2_5;
    int answer2_6;
    int answer2_7;
    int answer2_8;


    //3. Installationen
    String text3 = "3. Installation:";

    String getQuestion3_1 = "Er udstyr til adskillelse og afbrydelse korrekt valgt, placeret og installeret?";
    String getQuestion3_2 = "Er stikkontakter og udtag m.m. installeret i henhold til gældende bestemmelser?";
    String getQuestion3_3 = "Er kabler/ledninger korrekt oplagt, afsluttet og forbundet?";
    String getQuestion3_4 = "Er kabler beskyttet mod mekanisk overlast ved opføringer fra gulv/jord?";
    String getQuestion3_5 = "Er tilledninger aflastet for træk og vridning ved tilslutning til installationen?";
    String getQuestion3_6 = "Er alle dæksler og afdækninger monteret, så der ikke er berøringsfare?\n";
    String getQuestion3_7 = "Er alle samlinger let tilgængelige?";

    int answer3_1;
    int answer3_2;
    int answer3_3;
    int answer3_4;
    int answer3_5;
    int answer3_6;
    int answer3_7;


    //4. Indbygningsamaturer
    String text4 = "4. Indbygningsarmaturer:";

    String getQuestion4_1 = "Er indbygningsarmaturer korrekt valgt og monteret?";
    String getQuestion4_2 = "Er indbygningsarmaturer installeret således, at overophedning undgås?";

    int answer4_1;
    int answer4_2;


    //5. Beskyttelsesledere
    String text5 = "5. Beskyttelsesledere og udligningsforbindelser:";

    String getQuestion5_1 = "Er jordingslederen korrekt valgt (minimum 6 mm2)?";
    String getQuestion5_2 = "Er der etableret beskyttende potentialudligning?";
    String getQuestion5_3 = "Er supplerende beskyttende potentialudligning etableret?";
    String getQuestion5_4 = "Er den gennemgående forbindelse i udligningsforbindelser kontrolleret?";
    String getQuestion5_5 = "Er den gennemgående forbindelse i beskyttelsesledere kontrolleret?";
    String getQuestion5_6 = "Er overgangsmodstand for jordelektroden kontrolleret?";

    int answer5_1;
    int answer5_2;
    int answer5_3;
    int answer5_4;
    int answer5_5;
    int answer5_6;

    //6. Fejlbeskyttelse/suplerende beskyttelse
    String text6 = "6. Fejlbeskyttelse/supplerende beskyttelse:";

    String getQuestion6_1 = "Er beskyttelsesmetode korrekt valgt i forhold til installationstype og systemjording?";
    String getQuestion6_2 = "Er RCD’er (fejlstrømsafbrydere) kontrolleret og afprøvet?";
    String getQuestion6_3 = "Er klasse I brugsgenstande tilsluttet til beskyttelseslederen?";

    int answer6_1;
    int answer6_2;
    int answer6_3;

    //Måleresultater
    String text = "Måleresultater" +
            "Her kan anføres relevante kredsdetaljer og måleresultater i forbindelse med idriftsættelse af installationen. ";
    //Kredsdetaljer

    //Afprøvning af RCD'er

    //Kortslutningsstrøm


    public VerificationChart() { //todo include costumer name and adress etc

    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setIdentificationOfResponsible(String identificationOfResponsible) {
        this.identificationOfResponsible = identificationOfResponsible;
    }

    public void setInstallationMadeBy(String installationMadeBy) {
        this.installationMadeBy = installationMadeBy;
    }

    public void setVerificationMadeBy(String verificationMadeBy) {
        this.verificationMadeBy = verificationMadeBy;
    }

    public void setDate(String date) {
        Date = date;
    }



    public String getCostumerName() {
        return costumerName;
    }

    public String getAddress() {
        return address;
    }

    public String getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public String getIdentificationOfResponsible() {
        return identificationOfResponsible;
    }

    public String getInstallationMadeBy() {
        return installationMadeBy;
    }

    public String getVerificationMadeBy() {
        return verificationMadeBy;
    }

    public String getDate() {
        return Date;
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

    public int getAnswer1_1() {
        return answer1_1;
    }

    public int getAnswer1_2() {
        return answer1_2;
    }

    public int getAnswer1_3() {
        return answer1_3;
    }

    public int getAnswer1_4() {
        return answer1_4;
    }

    public int getAnswer1_5() {
        return answer1_5;
    }

    public int getAnswer1_6() {
        return answer1_6;
    }

    public int getAnswer1_7() {
        return answer1_7;
    }

    public int getAnswer1_8() {
        return answer1_8;
    }

    public int getAnswer1_9() {
        return answer1_9;
    }

    public int getAnswer1_10() {
        return answer1_10;
    }

    public int getAnswer1_11() {
        return answer1_11;
    }

    public int getAnswer1_12() {
        return answer1_12;
    }

    public int getAnswer1_13() {
        return answer1_13;
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

    public int getAnswer2_1() {
        return answer2_1;
    }

    public int getAnswer2_2() {
        return answer2_2;
    }

    public int getAnswer2_3() {
        return answer2_3;
    }

    public int getAnswer2_4() {
        return answer2_4;
    }

    public int getAnswer2_5() {
        return answer2_5;
    }

    public int getAnswer2_6() {
        return answer2_6;
    }

    public int getAnswer2_7() {
        return answer2_7;
    }

    public int getAnswer2_8() {
        return answer2_8;
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

    public int getAnswer3_1() {
        return answer3_1;
    }

    public int getAnswer3_2() {
        return answer3_2;
    }

    public int getAnswer3_3() {
        return answer3_3;
    }

    public int getAnswer3_4() {
        return answer3_4;
    }

    public int getAnswer3_5() {
        return answer3_5;
    }

    public int getAnswer3_6() {
        return answer3_6;
    }

    public int getAnswer3_7() {
        return answer3_7;
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

    public int getAnswer4_1() {
        return answer4_1;
    }

    public int getAnswer4_2() {
        return answer4_2;
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

    public int getAnswer5_1() {
        return answer5_1;
    }

    public int getAnswer5_2() {
        return answer5_2;
    }

    public int getAnswer5_3() {
        return answer5_3;
    }

    public int getAnswer5_4() {
        return answer5_4;
    }

    public int getAnswer5_5() {
        return answer5_5;
    }

    public int getAnswer5_6() {
        return answer5_6;
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

    public int getAnswer6_1() {
        return answer6_1;
    }

    public int getAnswer6_2() {
        return answer6_2;
    }

    public int getAnswer6_3() {
        return answer6_3;
    }

    public String getText() {
        return text;
    }

    public void setAnswer1_1(int answer1_1) {
        this.answer1_1 = answer1_1;
    }

    public void setAnswer1_2(int answer1_2) {
        this.answer1_2 = answer1_2;
    }

    public void setAnswer1_3(int answer1_3) {
        this.answer1_3 = answer1_3;
    }

    public void setAnswer1_4(int answer1_4) {
        this.answer1_4 = answer1_4;
    }

    public void setAnswer1_5(int answer1_5) {
        this.answer1_5 = answer1_5;
    }

    public void setAnswer1_6(int answer1_6) {
        this.answer1_6 = answer1_6;
    }

    public void setAnswer1_7(int answer1_7) {
        this.answer1_7 = answer1_7;
    }

    public void setAnswer1_8(int answer1_8) {
        this.answer1_8 = answer1_8;
    }

    public void setAnswer1_9(int answer1_9) {
        this.answer1_9 = answer1_9;
    }

    public void setAnswer1_10(int answer1_10) {
        this.answer1_10 = answer1_10;
    }

    public void setAnswer1_11(int answer1_11) {
        this.answer1_11 = answer1_11;
    }

    public void setAnswer1_12(int answer1_12) {
        this.answer1_12 = answer1_12;
    }

    public void setAnswer1_13(int answer1_13) {
        this.answer1_13 = answer1_13;
    }

    public void setAnswer2_1(int answer2_1) {
        this.answer2_1 = answer2_1;
    }

    public void setAnswer2_2(int answer2_2) {
        this.answer2_2 = answer2_2;
    }

    public void setAnswer2_3(int answer2_3) {
        this.answer2_3 = answer2_3;
    }

    public void setAnswer2_4(int answer2_4) {
        this.answer2_4 = answer2_4;
    }

    public void setAnswer2_5(int answer2_5) {
        this.answer2_5 = answer2_5;
    }

    public void setAnswer2_6(int answer2_6) {
        this.answer2_6 = answer2_6;
    }

    public void setAnswer2_7(int answer2_7) {
        this.answer2_7 = answer2_7;
    }

    public void setAnswer2_8(int answer2_8) {
        this.answer2_8 = answer2_8;
    }

    public void setAnswer3_1(int answer3_1) {
        this.answer3_1 = answer3_1;
    }

    public void setAnswer3_2(int answer3_2) {
        this.answer3_2 = answer3_2;
    }

    public void setAnswer3_3(int answer3_3) {
        this.answer3_3 = answer3_3;
    }

    public void setAnswer3_4(int answer3_4) {
        this.answer3_4 = answer3_4;
    }

    public void setAnswer3_5(int answer3_5) {
        this.answer3_5 = answer3_5;
    }

    public void setAnswer3_6(int answer3_6) {
        this.answer3_6 = answer3_6;
    }

    public void setAnswer3_7(int answer3_7) {
        this.answer3_7 = answer3_7;
    }

    public void setAnswer4_1(int answer4_1) {
        this.answer4_1 = answer4_1;
    }

    public void setAnswer4_2(int answer4_2) {
        this.answer4_2 = answer4_2;
    }

    public void setAnswer5_1(int answer5_1) {
        this.answer5_1 = answer5_1;
    }

    public void setAnswer5_2(int answer5_2) {
        this.answer5_2 = answer5_2;
    }

    public void setAnswer5_3(int answer5_3) {
        this.answer5_3 = answer5_3;
    }

    public void setAnswer5_4(int answer5_4) {
        this.answer5_4 = answer5_4;
    }

    public void setAnswer5_5(int answer5_5) {
        this.answer5_5 = answer5_5;
    }

    public void setAnswer5_6(int answer5_6) {
        this.answer5_6 = answer5_6;
    }

    public void setAnswer6_1(int answer6_1) {
        this.answer6_1 = answer6_1;
    }

    public void setAnswer6_2(int answer6_2) {
        this.answer6_2 = answer6_2;
    }

    public void setAnswer6_3(int answer6_3) {
        this.answer6_3 = answer6_3;
    }
}