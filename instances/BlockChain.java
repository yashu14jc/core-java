class BlockChain {

    String name = "Bitcoin";
    String type = "Cryptocurrency";
    int blocks = 1000;
    double value = 50000.5;
    boolean secure = true;

    String owner;
    int transactions;
    double size;
    char grade;
    boolean verified;

    public static void main(String[] args) {

        BlockChain blockChain1 = new BlockChain();
        BlockChain blockChain2 = new BlockChain();

        System.out.println(blockChain1.name);
        System.out.println(blockChain1.type);
        System.out.println(blockChain1.blocks);
        System.out.println(blockChain1.value);
        System.out.println(blockChain1.secure);
        System.out.println(blockChain1.owner);
        System.out.println(blockChain1.transactions);
        System.out.println(blockChain1.size);
        System.out.println(blockChain1.grade);
        System.out.println(blockChain1.verified);

        System.out.println("----------");

        System.out.println(blockChain2.name);
        System.out.println(blockChain2.type);
        System.out.println(blockChain2.blocks);
        System.out.println(blockChain2.value);
        System.out.println(blockChain2.secure);
        System.out.println(blockChain2.owner);
        System.out.println(blockChain2.transactions);
        System.out.println(blockChain2.size);
        System.out.println(blockChain2.grade);
        System.out.println(blockChain2.verified);
    }
}