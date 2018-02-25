
package memoryallocation;

public class Hole {
    private int startAddress;
    private int size;
    private int endAddress;

    public Hole(int startAddress, int size) {
        this.startAddress = startAddress;
        this.size = size;
        this.endAddress = startAddress+size;
    }

    public int getEndAddress() {
        return endAddress;
    }

    public int getSize() {
        return size;
    }

    public int getStartAddress() {
        return startAddress;
    }

    public void setEndAddress(int endAddress) {
        this.endAddress = endAddress;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setStartAddress(int startAddress) {
        this.startAddress = startAddress;
    }

    
    
}
