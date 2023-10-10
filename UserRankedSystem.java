public class UserRankedSystem {
    int rank;
    int progress;
    public UserRankedSystem() {
        this.rank = -8;
        this.progress = 0;
    }

    public void incProgress(int rank) {
        System.out.println(this.rank);
        System.out.println(this.progress);
        if (rank == 0 || Math.abs(rank) > 8) {
            throw new ArithmeticException();
        }
        if (this.rank == 8) {
            return;
        }
        int d = rank - this.rank;
        if (rank > 0 && this.rank < 0) {
            d -= 1;
        } else if (rank < 0 && this.rank > 0) {
            d += 1;
        }
        if (d == 0) {
            this.progress += 3;
        } else if (d == -1) {
            this.progress += 1;
        } else if (d > 0) {
            this.progress += 10 * d * d;
        }

        while (this.progress >= 100) {
            if (this.rank != -1) {
                this.rank += 1;
            } else {
                this.rank += 2;
            }
            if (this.rank == 8) {
                this.progress = 0;
            } else {
                this.progress -= 100;
            }
            System.out.println(this.rank);
            System.out.println(this.progress);
        }
        System.out.println(this.rank);
        System.out.println(this.progress);
    }
}
