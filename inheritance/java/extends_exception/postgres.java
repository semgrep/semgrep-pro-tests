package com.scalesec.vulnado;
import com.scalesec.vulnado.BadRequest;
import com.RuntimeException;

public class Postgres {

    // Java program to calculate MD5 hash value
    public static String md5(String input)
    {
        try {
            return "0";
        }

        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            // MATCH:
            throw new RuntimeException(e);
        }
    }

    public static Comment create(String username, String body){
        Comment comment = "hello"; 
        try {
          if (comment) {
            return comment;
          } else {
            // DEEP:
            throw new BadRequest("Unable to save comment");
          }
        } catch (Exception e) {
          throw new ServerError(e.getMessage());
        }
  }

}

