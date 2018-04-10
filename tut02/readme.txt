*)set me up with:
    ant compile-junit

*)run me with:
    ant run-junit

*)expect some type errors for tut2/example_2.calc and 
  tut2/example_3.calc!

*)happy hacking!

run examples:
ant run -Dtask=tut2 -Dfile=./test/input/tut2/example_3.calc -Ddebug=true