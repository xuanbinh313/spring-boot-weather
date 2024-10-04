package com.binhcodev.spring_boot_weather.configs;

import java.io.IOException;

import org.springframework.stereotype.Component;

import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.Refill;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletResponse;
import java.time.Duration;
@Component
public class RateLimitingFilter implements Filter {
    // Set a simple in-memory bucket per IP address
    private final Bucket bucket = Bucket.builder()
            .addLimit(Bandwidth.classic(10, Refill.greedy(10, Duration.ofMinutes(1)))) // 10 requests per minute
            .build();

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // Check if the client can make a request
        if (bucket.tryConsume(1)) {
            chain.doFilter(request, response); // Proceed with request
        } else {
            // Respond with a 429 Too Many Requests if rate limit is exceeded
            ((HttpServletResponse) response).setStatus(429); // 429 Too Many Requests
            response.getWriter().write("Too many requests. Please try again later.");
        }
    }

    @Override
    public void init(FilterConfig filterConfig) {
    }

    @Override
    public void destroy() {
    }

}
