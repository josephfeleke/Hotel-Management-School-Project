
package netbeansswingmodernui;

/**
 *
 * @author josephfeleke
 */
public class AppUser {
    
    private int userId;
    private String userName;
    private String password;
    private int userTypeId;
    
    
    public int getUserTypeId(){
        return userId;
    }
    
    public String getUserName(){
        return userName;
    }
    
    public String getPassword(){
        return password;
    }
    
    public int getTypeId(){
        return userTypeId;
    }
    
    public void setUserName(String userName){
        this.userName = userName;
    }
    
    public void setPassword(){
        this.password=password;
    }
    
    public void userTypeId(int userTypeId){
        this.userTypeId = userTypeId;
    }
   
            
    
}
