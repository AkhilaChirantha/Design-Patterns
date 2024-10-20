public class Youtube {

    public static void main(String[] args) {
        

        Subject myChannel = new Channel();

        Subscriber s1 = new Subscriber("Amal");
        Subscriber s2 = new Subscriber("Nihal");
        Subscriber s3 = new Subscriber("Akhila");


        myChannel.subscribe(s1);
        myChannel.subscribe(s2);
        myChannel.subscribe(s3);

        myChannel.unsubscribe(s2);
     

       

        s1.subscribeChannel(myChannel);
        s2.subscribeChannel(myChannel);
        s3.subscribeChannel(myChannel);


    



       myChannel.upload("Learning design patterns.");

    }

}
