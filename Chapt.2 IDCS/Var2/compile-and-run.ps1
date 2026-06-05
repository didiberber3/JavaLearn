# 设置控制台编码为UTF-8
chcp 65001 | Out-Null
$env:JAVA_TOOL_OPTIONS="-Dfile.encoding=UTF-8"

Write-Host "正在编译Java程序..." -ForegroundColor Green
javac -encoding UTF-8 -d out/production/Hello src/Main.java

if ($LASTEXITCODE -eq 0) {
    Write-Host "编译成功！正在运行程序..." -ForegroundColor Green
    java -cp out/production/Hello Main
} else {
    Write-Host "编译失败！" -ForegroundColor Red
}