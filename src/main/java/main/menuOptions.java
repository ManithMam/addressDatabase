package main;

public enum menuOptions {

    a("Browse person entries"),
    b("Toggle filtering person entries"),
    c("Create person entry"),
    d("Delete person entry"),
    e("Exit");

    final String option;

    menuOptions(final String option){
        this.option = option;
    }



}
