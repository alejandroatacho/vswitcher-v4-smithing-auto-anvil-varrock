int bar = 2349;
int smithedItem = 1205;
int avil = 2097;
int hammer = 2347;
SmithItem smithItem = SmithItem.DAGGER;
if(v.getLocalPlayer().hasAnimation(-1)) {
    if(v.getInventory().amountInInventory(smithedItem,27,28)) {
        if(v.getWalking().isIdle()) {
            v.getBank().deposit(smithedItem,27);
        }
    } else if(v.getInventory().amountInInventory(bar,1,27)) {
        if(v.getSmithing().isSmithingOpen()) {
            v.getSmithing().smith(smithItem, smithedItem);
        } else {
            v.getSmithing().avil(avil);
        }
    } else if(v.getInventory().amountInInventory(hammer,1,1)) {
        if(v.getWalking().isIdle()) {
            v.getBank().withdraw(bar,27);
        }
    }
}