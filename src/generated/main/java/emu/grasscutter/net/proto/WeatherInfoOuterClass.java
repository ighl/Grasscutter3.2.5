// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class WeatherInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_WeatherInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WeatherInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WeatherInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WeatherInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0011WeatherInfo.proto\"&\n\u000bWeatherInfo\u0012\u0017\n\u000fweather_area_id\u0018\u0001 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WeatherInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_WeatherInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WeatherInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WeatherInfoOuterClass.internal_static_WeatherInfo_descriptor, new String[] { "WeatherAreaId" });
    }
    
    public static final class WeatherInfo extends GeneratedMessageV3 implements WeatherInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int WEATHER_AREA_ID_FIELD_NUMBER = 1;
        private int weatherAreaId_;
        private byte memoizedIsInitialized;
        private static final WeatherInfo DEFAULT_INSTANCE;
        private static final Parser<WeatherInfo> PARSER;
        
        private WeatherInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private WeatherInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WeatherInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WeatherInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 8: {
                            this.weatherAreaId_ = input.readUInt32();
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherInfoOuterClass.internal_static_WeatherInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherInfoOuterClass.internal_static_WeatherInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(WeatherInfo.class, Builder.class);
        }
        
        @Override
        public int getWeatherAreaId() {
            return this.weatherAreaId_;
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            if (this.weatherAreaId_ != 0) {
                output.writeUInt32(1, this.weatherAreaId_);
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.weatherAreaId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.weatherAreaId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WeatherInfo)) {
                return super.equals(obj);
            }
            final WeatherInfo other = (WeatherInfo)obj;
            return this.getWeatherAreaId() == other.getWeatherAreaId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getWeatherAreaId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WeatherInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WeatherInfo.PARSER.parseFrom(data);
        }
        
        public static WeatherInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WeatherInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WeatherInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WeatherInfo.PARSER.parseFrom(data);
        }
        
        public static WeatherInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WeatherInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WeatherInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WeatherInfo.PARSER.parseFrom(data);
        }
        
        public static WeatherInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WeatherInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WeatherInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeatherInfo.PARSER, input);
        }
        
        public static WeatherInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeatherInfo.PARSER, input, extensionRegistry);
        }
        
        public static WeatherInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WeatherInfo.PARSER, input);
        }
        
        public static WeatherInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WeatherInfo.PARSER, input, extensionRegistry);
        }
        
        public static WeatherInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeatherInfo.PARSER, input);
        }
        
        public static WeatherInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeatherInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WeatherInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WeatherInfo prototype) {
            return WeatherInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WeatherInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WeatherInfo getDefaultInstance() {
            return WeatherInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<WeatherInfo> parser() {
            return WeatherInfo.PARSER;
        }
        
        @Override
        public Parser<WeatherInfo> getParserForType() {
            return WeatherInfo.PARSER;
        }
        
        @Override
        public WeatherInfo getDefaultInstanceForType() {
            return WeatherInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WeatherInfo();
            PARSER = new AbstractParser<WeatherInfo>() {
                @Override
                public WeatherInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WeatherInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WeatherInfoOrBuilder
        {
            private int weatherAreaId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherInfoOuterClass.internal_static_WeatherInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherInfoOuterClass.internal_static_WeatherInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(WeatherInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WeatherInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.weatherAreaId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WeatherInfoOuterClass.internal_static_WeatherInfo_descriptor;
            }
            
            @Override
            public WeatherInfo getDefaultInstanceForType() {
                return WeatherInfo.getDefaultInstance();
            }
            
            @Override
            public WeatherInfo build() {
                final WeatherInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WeatherInfo buildPartial() {
                final WeatherInfo result = new WeatherInfo(this);
                result.weatherAreaId_ = this.weatherAreaId_;
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof WeatherInfo) {
                    return this.mergeFrom((WeatherInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WeatherInfo other) {
                if (other == WeatherInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getWeatherAreaId() != 0) {
                    this.setWeatherAreaId(other.getWeatherAreaId());
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                WeatherInfo parsedMessage = null;
                try {
                    parsedMessage = WeatherInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WeatherInfo)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public int getWeatherAreaId() {
                return this.weatherAreaId_;
            }
            
            public Builder setWeatherAreaId(final int value) {
                this.weatherAreaId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearWeatherAreaId() {
                this.weatherAreaId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface WeatherInfoOrBuilder extends MessageOrBuilder
    {
        int getWeatherAreaId();
    }
}
