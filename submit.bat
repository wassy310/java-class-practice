@echo off
echo start submitting
set TargetDir=\\ara.okinawa-ct.ac.jp\public\�u�`����\���Ȗ�\���ʐM�V�X�e���H�w��\�v���O���~���O\2015���p�v���O���~���O�T\�ۑ��o
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
