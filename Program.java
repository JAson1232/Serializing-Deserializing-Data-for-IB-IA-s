 public static void writeData(Users object){
        try{  
        
//This function takes in an Object type called Users and serializes it and stores it in a file called Data.txt
  
  FileOutputStream fout=new FileOutputStream("Data.txt");  
  ObjectOutputStream out=new ObjectOutputStream(fout);  
  out.writeObject(object);  
  out.flush();  
  //closing the stream  
  out.close();  
  System.out.println("success");  
  }catch(Exception e){System.out.println(e);}  
    }
    
    
    
 //This function takes in an input of the data stream that was created before and deserializes the data and adds the existing Users to the system   
    public static void deserialize(){
        try{  
  //Creating stream to read the object  
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("Data.txt"));  
  
  //Here you can add your own code to do whatever you want with your data 
  Users user =(Users)in.readObject(); 
  Users.addUser(user,1);  
  //closing the stream  
  in.close();  
  }catch(Exception e){System.out.println(e);}  
    }
