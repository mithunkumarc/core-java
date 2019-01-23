Examples : 
        
#### timezones
        
        //old
        Date now = new Date();         
        // New
        ZonedDateTime znow = ZonedDateTime.now();
                
        System.out.println(now);
        System.out.println(znow);
        
        
        
        
        
#### specific date
        // Old
        Date birthDay = new GregorianCalendar(1990, Calendar.DECEMBER, 15).getTime();
        // New
        LocalDate NewbirthDay = LocalDate.of(1990, Month.DECEMBER, 15);
        
        System.out.println("old specific date ="+birthDay);
        System.out.println("new specific date ="+NewbirthDay);
        
        
#### extracting specific fields
        
        // Old
        int oldMonth = new GregorianCalendar().get(Calendar.MONTH);
         
        // New
        Month newMonth = LocalDateTime.now().getMonth();        //try getDate()/getDay()/getYear()
        System.out.println("old way getting month ="+oldMonth);
        System.out.println("new way getting month ="+newMonth);
        
        
#### converting timezone
        
        // Old
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeZone(TimeZone.getTimeZone("CET"));
        Date centralEastern = calendar.getTime();
         
        // New
        ZonedDateTime newCentralEastern = LocalDateTime.now().atZone(ZoneId.of("CET"));
        System.out.println("old api timezone = "+centralEastern);
        System.out.println("new api timezone = "+newCentralEastern);
        
        
#### Number of days in a month

        // Old
        Calendar o_calendar = new GregorianCalendar(2016, Calendar.FEBRUARY, 20);
        int o_daysInMonth = o_calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
         
        // New
        int o_daysInMonthNew = YearMonth.of(2016, 2).lengthOfMonth();
        System.out.println("old number of days month= "+o_daysInMonth);
        System.out.println("new number of days month= "+o_daysInMonthNew);

