# README

## Prerequisites

### Environment Setup

```sh
source ./env.sh
export PATH=$JAVA_HOME/bin:$PATH
java -version
```

## Build&Run

### Purple

#### Chap6

```sh
javac ${JAVA_COMMON_OPT} -d target/classes src/main/java/com/javagold17/purple/sample/chap6/Main.java
java -cp target/classes com.javagold17.purple.sample.chap6.Main
# ビルドと実行一括コマンド
javac ${JAVA_COMMON_OPT} -d target/classes src/main/java/com/javagold17/purple/sample/chap6/Main.java && java -cp target/classes com.javagold17.purple.sample.chap6.Main
```

### Black

#### Practice

##### Chap1

```sh
javac ${JAVA_COMMON_OPT} -d target/classes -sourcepath src/main/java src/main/java/com/javagold17/black/practice/chap1/Main.java
java -cp target/classes com.javagold17.black.practice.chap1.Main
# ビルドと実行一括コマンド
javac ${JAVA_COMMON_OPT} -d target/classes -sourcepath src/main/java src/main/java/com/javagold17/black/practice/chap1/Main.java && java -cp target/classes com.javagold17.black.practice.chap1.Main
```
