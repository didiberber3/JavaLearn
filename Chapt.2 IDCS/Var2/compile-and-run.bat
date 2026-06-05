@echo off
chcp 65001
set JAVA_TOOL_OPTIONS=-Dfile.encoding=UTF-8

echo 正在编译Java程序...
javac -encoding UTF-8 -d out/production/Hello src/Main.java

if %errorlevel% equ 0 (
    echo 编译成功！正在运行程序...
    java -cp out/production/Hello Main
) else (
    echo 编译失败！
)
pause
