
package memoryallocation;

public class Process {
    private String name;
    private int size;
    private int start;
    private int end;

    public Process(String name, int size, int location) {
        this.name = name;
        this.size = size;
        this.start= location;
        this.end = this.start+this.size;
    }

    public Process(String name, int size) {
         this.name = name;
        this.size = size;
    }

    public int getStart() {
        return start;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
     public int getEnd() {
        return end;
    }

    public void setStart(int start) {
        this.start = start;
    }
     public void setEnd() {
        this.end = this.start+this.size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    
}
