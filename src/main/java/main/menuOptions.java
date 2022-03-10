package main;

public enum menuOptions {

    a("Browse person entries"),
    b("Toggle filtering person entries"),
    c("Delete person entry"),
    d("Delete person entry"),
    e("Exit");

    private String option;
    private menuOptions(final String option){
        this.option = option;
    }

}
