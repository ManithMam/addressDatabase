package main;

public enum menuOptions {

    a("Browse person entries"),
    b("Toggle filtering person entries"),
    c("Create person entry"),
    d("Delete person entry"),
    e("Exit");

    String option;

    private menuOptions(final String option){
        this.option = option;
    }



}
