package Scrabble.Logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TileBag {
    private List<Tiles> bag = new ArrayList<>();

    public TileBag() {
        newBag();
    }

    public void newBag(){
        //A-9, B-2, C-2, D-4, E-12, F-2, G-3, H-2, I-9, J-1, K-1, L-4, M-2, N-6,
        //O-8, P-2, Q-1, R-6, S-4, T-6, U-4, V-2, W-2, X-1, Y-2, Z-1 and Blanks-2

        if(!this.bag.isEmpty()){
            this.bag.clear();
        }

        this.bag.addAll(Collections.nCopies(9, Tiles.A));
        this.bag.addAll(Collections.nCopies(2, Tiles.B));
        this.bag.addAll(Collections.nCopies(2, Tiles.C));
        this.bag.addAll(Collections.nCopies(4, Tiles.D));
        this.bag.addAll(Collections.nCopies(12, Tiles.E));
        this.bag.addAll(Collections.nCopies(2, Tiles.F));
        this.bag.addAll(Collections.nCopies(3, Tiles.G));
        this.bag.addAll(Collections.nCopies(2, Tiles.H));
        this.bag.addAll(Collections.nCopies(9, Tiles.I));
        this.bag.addAll(Collections.nCopies(1, Tiles.J));
        this.bag.addAll(Collections.nCopies(1, Tiles.J));
        this.bag.addAll(Collections.nCopies(4, Tiles.L));
        this.bag.addAll(Collections.nCopies(2, Tiles.M));
        this.bag.addAll(Collections.nCopies(6, Tiles.N));
        this.bag.addAll(Collections.nCopies(8, Tiles.O));
        this.bag.addAll(Collections.nCopies(2, Tiles.P));
        this.bag.addAll(Collections.nCopies(1, Tiles.Q));
        this.bag.addAll(Collections.nCopies(6, Tiles.R));
        this.bag.addAll(Collections.nCopies(4, Tiles.S));
        this.bag.addAll(Collections.nCopies(6, Tiles.T));
        this.bag.addAll(Collections.nCopies(4, Tiles.U));
        this.bag.addAll(Collections.nCopies(2, Tiles.V));
        this.bag.addAll(Collections.nCopies(2, Tiles.W));
        this.bag.addAll(Collections.nCopies(1, Tiles.X));
        this.bag.addAll(Collections.nCopies(2, Tiles.Y));
        this.bag.addAll(Collections.nCopies(1, Tiles.Z));
        this.bag.addAll(Collections.nCopies(2, Tiles.BLANK));
    }

    public List<Tiles> getBag() {
        return bag;
    }

    public void setBag(List<Tiles> bag) {
        this.bag = bag;
    }

    public void shuffleBag(){
        Collections.shuffle(this.bag);
    }

    public Tiles drawTile(){
        Tiles tile = this.bag.get(0);
        this.bag.remove(0);
        return tile;
    }

    public int size(){
        return this.bag.size();
    }
}
