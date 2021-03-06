package cpe200;

import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    private ArrayList<User> userList;

    public Users()
    {
        userList=new ArrayList<>();
    }

    public void addUser(User user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        User temp=new User(userName,password);
        this.addUser(temp);
    }

    public void deleteUser(User user)
    {
        for(int i=0;i<userList.size();i++)
        {
            User test=userList.get(i);
            if(test.getUserName()==user.getUserName())
            {
                userList.remove(i);
            }
        }
    }

    public boolean exists(User user)
    {
        for(int i=0;i<userList.size();i++)
        {
            User test=userList.get(i);
            if(test.getUserName()==user.getUserName())
            {
                return true;
            }
        }
        return false;
    }

    public boolean usernameExists(String username)
    {
        for(int i=0;i<userList.size();i++)
        {
            User test=userList.get(i);
            if(test.getUserName()==username)
            {
                return true;
            }
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        for(int i=0;i<userList.size();i++)
        {
            User test=userList.get(i);
            if(test.getUserName()==userName)
            {
                return test;
            }
        }
        return null;
    }

    public int count()
    {
        return userList.size();
    }

    public User[] getUserArray()
    {
        User[] sent=new User[userList.size()];
        for(int i=0;i<userList.size();i++)
        {
            sent[i]=userList.get(i);
        }
        return sent;
    }
}
