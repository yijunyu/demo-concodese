java -Xms1024M -Xmx4096M -XX:+UseConcMarkSweepGC -XX:-UseGCOverheadLimit -cp ../config/lic:../config:ConCodeSe-1.0.0.jar com.concodese.ContextualRepositoryCreator
rm derby.log
