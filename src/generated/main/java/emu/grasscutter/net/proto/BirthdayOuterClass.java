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

public final class BirthdayOuterClass
{
    private static final Descriptors.Descriptor internal_static_Birthday_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_Birthday_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private BirthdayOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return BirthdayOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u000eBirthday.proto\"&\n\bBirthday\u0012\r\n\u0005month\u0018\u0001 \u0001(\r\u0012\u000b\n\u0003day\u0018\u0002 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        BirthdayOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_Birthday_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_Birthday_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(BirthdayOuterClass.internal_static_Birthday_descriptor, new String[] { "Month", "Day" });
    }
    
    public static final class Birthday extends GeneratedMessageV3 implements BirthdayOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int MONTH_FIELD_NUMBER = 1;
        private int month_;
        public static final int DAY_FIELD_NUMBER = 2;
        private int day_;
        private byte memoizedIsInitialized;
        private static final Birthday DEFAULT_INSTANCE;
        private static final Parser<Birthday> PARSER;
        
        private Birthday(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private Birthday() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new Birthday();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private Birthday(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.month_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.day_ = input.readUInt32();
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
            return BirthdayOuterClass.internal_static_Birthday_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return BirthdayOuterClass.internal_static_Birthday_fieldAccessorTable.ensureFieldAccessorsInitialized(Birthday.class, Builder.class);
        }
        
        @Override
        public int getMonth() {
            return this.month_;
        }
        
        @Override
        public int getDay() {
            return this.day_;
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
            if (this.month_ != 0) {
                output.writeUInt32(1, this.month_);
            }
            if (this.day_ != 0) {
                output.writeUInt32(2, this.day_);
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
            if (this.month_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.month_);
            }
            if (this.day_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.day_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Birthday)) {
                return super.equals(obj);
            }
            final Birthday other = (Birthday)obj;
            return this.getMonth() == other.getMonth() && this.getDay() == other.getDay() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getMonth();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getDay();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static Birthday parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return Birthday.PARSER.parseFrom(data);
        }
        
        public static Birthday parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Birthday.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Birthday parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return Birthday.PARSER.parseFrom(data);
        }
        
        public static Birthday parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Birthday.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Birthday parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return Birthday.PARSER.parseFrom(data);
        }
        
        public static Birthday parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return Birthday.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static Birthday parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Birthday.PARSER, input);
        }
        
        public static Birthday parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Birthday.PARSER, input, extensionRegistry);
        }
        
        public static Birthday parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Birthday.PARSER, input);
        }
        
        public static Birthday parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(Birthday.PARSER, input, extensionRegistry);
        }
        
        public static Birthday parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Birthday.PARSER, input);
        }
        
        public static Birthday parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(Birthday.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return Birthday.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final Birthday prototype) {
            return Birthday.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == Birthday.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static Birthday getDefaultInstance() {
            return Birthday.DEFAULT_INSTANCE;
        }
        
        public static Parser<Birthday> parser() {
            return Birthday.PARSER;
        }
        
        @Override
        public Parser<Birthday> getParserForType() {
            return Birthday.PARSER;
        }
        
        @Override
        public Birthday getDefaultInstanceForType() {
            return Birthday.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new Birthday();
            PARSER = new AbstractParser<Birthday>() {
                @Override
                public Birthday parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new Birthday(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BirthdayOrBuilder
        {
            private int month_;
            private int day_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return BirthdayOuterClass.internal_static_Birthday_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return BirthdayOuterClass.internal_static_Birthday_fieldAccessorTable.ensureFieldAccessorsInitialized(Birthday.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (Birthday.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.month_ = 0;
                this.day_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return BirthdayOuterClass.internal_static_Birthday_descriptor;
            }
            
            @Override
            public Birthday getDefaultInstanceForType() {
                return Birthday.getDefaultInstance();
            }
            
            @Override
            public Birthday build() {
                final Birthday result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public Birthday buildPartial() {
                final Birthday result = new Birthday(this);
                result.month_ = this.month_;
                result.day_ = this.day_;
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
                if (other instanceof Birthday) {
                    return this.mergeFrom((Birthday)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final Birthday other) {
                if (other == Birthday.getDefaultInstance()) {
                    return this;
                }
                if (other.getMonth() != 0) {
                    this.setMonth(other.getMonth());
                }
                if (other.getDay() != 0) {
                    this.setDay(other.getDay());
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
                Birthday parsedMessage = null;
                try {
                    parsedMessage = Birthday.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (Birthday)e.getUnfinishedMessage();
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
            public int getMonth() {
                return this.month_;
            }
            
            public Builder setMonth(final int value) {
                this.month_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMonth() {
                this.month_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getDay() {
                return this.day_;
            }
            
            public Builder setDay(final int value) {
                this.day_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearDay() {
                this.day_ = 0;
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
    
    public interface BirthdayOrBuilder extends MessageOrBuilder
    {
        int getMonth();
        
        int getDay();
    }
}
