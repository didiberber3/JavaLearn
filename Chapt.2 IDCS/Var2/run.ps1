# 设置控制台编码为UTF-8
[Console]::OutputEncoding = [System.Text.Encoding]::UTF8
$OutputEncoding = [System.Text.Encoding]::UTF8

Write-Host "编译Java程序..." -ForegroundColor Green
javac -encoding UTF-8 -d out/production/Hello src/Main.java

if ($LASTEXITCODE -eq 0) {
    Write-Host "编译成功，运行程序..." -ForegroundColor Green
    java -Dfile.encoding=UTF-8 -cp out/production/Hello Main
} else {
    Write-Host "编译失败！" -ForegroundColor Red
}

Read-Host "按任意键继续"
