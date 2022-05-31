# UC Opret nyt skema

UseCase navn | Opret nyt skema | 
-------------| -------------------------------| 
Scope        | El-installatør app
Primary Actor| El-installatører/Kunder
Level        | User-goal
Description  | Systemet skal kunne oprette en bruger i databasen, logge ind med denne bruger, oprette et skema som brugeren skal kunne afkrydse, skabe en .pdf fil af skemaet, sende denne .pdf fil samt eventuel tekst over mail til en modtager, skifte over til fx. Gmail appen for at færdig gøre afsending af email.
Stakeholders and Interests  | Zealand
Preconditions  | Android telefonen er tændt.<br> Applikationen er installeret korrekt og er klar til at bruge.
Succes Guarantee  |  Der er blevet oprettet en .pdf fil og den er sendt videre til en modtager som email.  
Main Succes Scenario  | 1. Brugeren skaber en ny konto.<br> 2. Systemet opretter brugeren i databasen.<br> 3. Brugeren logger ind med den nye konto.<br> 4. Systemet godkender at brugeren logger ind.<br> 5. Brugeren opretter et nyt skema.<br> 6. Systemet viser et blankt skema.<br> 7. Brugeren afkrydser skemaet, tilføjer billeder og trykker færdig.<br> 8. Systemet opretter skemaet som en .pdf fil og gemmer den.<br> 9. Systemet viser send mail siden.<br> 10. Brugeren vælger en modtager fra en liste, udfylder titel og tekst, og trykker send mail.<br> 11. Systemet tilføjer .pdf filen til emailen.<br> 12. Systemet beder dig vælge hvilken email app du vil bruge til at sende din mail.<br> 13. Brugeren vælger Gmail appen.<br> 14. Systemet åbner Gmailappen med den indtastede titel, tekst, modtager og tilføjede .pdf fil.
Extensions  | 1a. Hvis brugeren allerede har en konto.<br> 1. Brugeren åbner appen, indtaster sin login information og trykker login.<br> 2. Systemet godkender brugerens login information og logger brugeren ind.<br><br> 5a. Brugeren ønsker at fortsætte på et allerede eksisterende skema.<br> 1. Systemet viser en liste over ikke-udfyldte skemaer.<br> 2. Brugeren vælger et skema at på listen.<br> 3. Systemet åbner skemaet<br> 4. Brugeren udfylder skemaet og trykker færdig.<br> Fortsætter fra punkt 8.<br><br> 10a. Brugeren vælger ikke modtager fra liste.<br> 1. Brugeren indtaster email addressen på sin modtager, derefter titel og tekst, trykker til sidst send mail.<br> Fortsætter fra punkt 11.  
Special Requirements  | --
Technology and Data Variations List  | --
Frequency of Occurrence  | Denne use case forekommer ved oprettelsen af et skema. 
Miscellaneous  | --
