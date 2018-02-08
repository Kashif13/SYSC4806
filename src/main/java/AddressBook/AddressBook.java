package AddressBook;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.*;

@Entity
public class AddressBook{

    private List<BuddyInfo> buddies;
    private int size;
    private Long id;


    public AddressBook(){
        this.buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        this.buddies.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        this.buddies.remove(buddy);
    }


    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }



    @OneToMany(mappedBy = "addressBook", cascade = CascadeType.PERSIST)
    public List<BuddyInfo> getBuddies() {
        return buddies;
    }

    public void setBuddies(List<BuddyInfo> buddies) {
        this.buddies = buddies;
    }

    public int getSize(){
        return buddies.size();
    }

    public void setSize(int size){
        this.size = size;
    }

    public String toString(){
        String result = "AddressBook.AddressBook ID: " + this.getId() + '\n';
        for(BuddyInfo buddy : this.buddies){
            result += buddy.toString() + '\n';
        }
        return result;
    }

}