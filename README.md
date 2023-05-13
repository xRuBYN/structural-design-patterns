Adapter

Adapter este un design pattern creational care ne ajuta ca sa adaptam o clasa de la una la alta, sau
o metoda.
În cazul meu am adaptat transmiterea unui mesaje de tip tcp ca să primească aceealeași date care le,
primește și clasa udp.
Pentru asta am avut nevoie de un adapter care e reprezentata de clasa RequestAdapter și de un 
Adaptee(obiectul care îl voi adapta) iar target este interfata de la care se mosteneste Request adapterul nostru 
![Screenshot 2023-05-09 at 22.45.25.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fmf%2Fh1b3s4z5123gpxzzqpsmywfh0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_FoRhsl%2FScreenshot%202023-05-09%20at%2022.45.25.png)

Bridge 

La fel este un design pattern structural care întrun mod oarecare separă abstracția de implimentare,
sau mai bine spus desparte o clasă complexă în două mai simple.La fel aceste clase separate pot exista independent una 
de alta.
În cazul meu am Material care este implimentat de materiale concrete anume metal si wood si o clasa 
abstracta care se numeste Toy care contine un tip de material. La rindul ei clasa toy este extinsa 
de soldiertoy si de cartoy.

![Screenshot 2023-05-09 at 22.56.47.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fmf%2Fh1b3s4z5123gpxzzqpsmywfh0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_mgmEn9%2FScreenshot%202023-05-09%20at%2022.56.47.png)

Decorator

Un alt design pattern structural care ne permite dinamic sa adaugam functional unui obiecto functionalitate noua.
In cazul meu am o pagina la care ii adaug footer si header cu ajutorul decoratorului.
Pentru acesta este nevoie de o interfata care se numete Page si de un ConcretPage care implimenteaza aceasta interfata
in cazul meu este WordPage apoi avem nevoie de un decorator care la fel implimenteza page dupa asta creeem 
decoratorii nostri footer si header care apoi ii putem pune la pagina nostra prin injectie.
![Screenshot 2023-05-09 at 23.02.44.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Fmf%2Fh1b3s4z5123gpxzzqpsmywfh0000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_5cPKLD%2FScreenshot%202023-05-09%20at%2023.02.44.png)

Facade

Este un design pattern structural care da o interfata simpla pentru o clasa complexa 
Cel mai clasic exemplu este Controller si Service


Proxy

Avem trei tipuri de proxy, security proxy, remote proxy, si virtual proxy in cazul meu eu am implimentat 
virtual proxy si anume o systema de caching pentru o baza de date.