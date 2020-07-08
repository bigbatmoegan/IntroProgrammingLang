#!/usr/bin/perl
use strict;
my @arr = (10,4,23,99,7,2,1,11,44,15);
print("Unsorted array: ");
print join(",",@arr);
print("\n");
@arr = bubble(@arr);
print("Sorted array: ");
print join(",",@arr);
#sort using bubble
sub bubble {
    my @arr2 = @_;
    for(my $i=0,my $temp=1;$i <= $#arr2;++$i){
        if($arr2[$i]<$arr2[$i+1]){
            $temp=$arr2[$i];
            $arr2[$i]=$arr2[$i+1];
            $arr2[$i+1]=$temp;
            $i=-1;
        }
    }
    return(@arr2);
}