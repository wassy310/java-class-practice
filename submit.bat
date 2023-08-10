@echo off
echo start submitting
set TargetDir=\\ara.okinawa-ct.ac.jp\public\講義資料\専門科目\情報通信システム工学科\プログラミング\2015応用プログラミングⅠ\課題提出
echo %TargetDir%
echo %CurrDirName%
for %%* in (.) do set CurrDirName=%%~n*
xcopy ..\%CurrDirName% %TargetDir%\%CurrDirName% /E /Y /I
if errorlevel 1 goto error
echo success
goto end

:error
echo fail

:end
pause
