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
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ByteString;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class HomeBlockDotPatternOuterClass
{
    private static final Descriptors.Descriptor internal_static_HomeBlockDotPattern_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_HomeBlockDotPattern_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private HomeBlockDotPatternOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return HomeBlockDotPatternOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019HomeBlockDotPattern.proto\"B\n\u0013HomeBlockDotPattern\u0012\r\n\u0005width\u0018\b \u0001(\r\u0012\u000e\n\u0006height\u0018\u000b \u0001(\r\u0012\f\n\u0004data\u0018\t \u0001(\fB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        HomeBlockDotPatternOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_HomeBlockDotPattern_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeBlockDotPattern_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(HomeBlockDotPatternOuterClass.internal_static_HomeBlockDotPattern_descriptor, new String[] { "Width", "Height", "Data" });
    }
    
    public static final class HomeBlockDotPattern extends GeneratedMessageV3 implements HomeBlockDotPatternOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int WIDTH_FIELD_NUMBER = 8;
        private int width_;
        public static final int HEIGHT_FIELD_NUMBER = 11;
        private int height_;
        public static final int DATA_FIELD_NUMBER = 9;
        private ByteString data_;
        private byte memoizedIsInitialized;
        private static final HomeBlockDotPattern DEFAULT_INSTANCE;
        private static final Parser<HomeBlockDotPattern> PARSER;
        
        private HomeBlockDotPattern(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private HomeBlockDotPattern() {
            this.memoizedIsInitialized = -1;
            this.data_ = ByteString.EMPTY;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new HomeBlockDotPattern();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private HomeBlockDotPattern(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 64: {
                            this.width_ = input.readUInt32();
                            continue;
                        }
                        case 74: {
                            this.data_ = input.readBytes();
                            continue;
                        }
                        case 88: {
                            this.height_ = input.readUInt32();
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
            return HomeBlockDotPatternOuterClass.internal_static_HomeBlockDotPattern_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HomeBlockDotPatternOuterClass.internal_static_HomeBlockDotPattern_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeBlockDotPattern.class, Builder.class);
        }
        
        @Override
        public int getWidth() {
            return this.width_;
        }
        
        @Override
        public int getHeight() {
            return this.height_;
        }
        
        @Override
        public ByteString getData() {
            return this.data_;
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
            if (this.width_ != 0) {
                output.writeUInt32(8, this.width_);
            }
            if (!this.data_.isEmpty()) {
                output.writeBytes(9, this.data_);
            }
            if (this.height_ != 0) {
                output.writeUInt32(11, this.height_);
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
            if (this.width_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.width_);
            }
            if (!this.data_.isEmpty()) {
                size += CodedOutputStream.computeBytesSize(9, this.data_);
            }
            if (this.height_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.height_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HomeBlockDotPattern)) {
                return super.equals(obj);
            }
            final HomeBlockDotPattern other = (HomeBlockDotPattern)obj;
            return this.getWidth() == other.getWidth() && this.getHeight() == other.getHeight() && this.getData().equals(other.getData()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getWidth();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getHeight();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getData().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static HomeBlockDotPattern parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return HomeBlockDotPattern.PARSER.parseFrom(data);
        }
        
        public static HomeBlockDotPattern parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeBlockDotPattern.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeBlockDotPattern parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return HomeBlockDotPattern.PARSER.parseFrom(data);
        }
        
        public static HomeBlockDotPattern parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeBlockDotPattern.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeBlockDotPattern parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return HomeBlockDotPattern.PARSER.parseFrom(data);
        }
        
        public static HomeBlockDotPattern parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return HomeBlockDotPattern.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static HomeBlockDotPattern parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeBlockDotPattern.PARSER, input);
        }
        
        public static HomeBlockDotPattern parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeBlockDotPattern.PARSER, input, extensionRegistry);
        }
        
        public static HomeBlockDotPattern parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeBlockDotPattern.PARSER, input);
        }
        
        public static HomeBlockDotPattern parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(HomeBlockDotPattern.PARSER, input, extensionRegistry);
        }
        
        public static HomeBlockDotPattern parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeBlockDotPattern.PARSER, input);
        }
        
        public static HomeBlockDotPattern parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(HomeBlockDotPattern.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return HomeBlockDotPattern.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final HomeBlockDotPattern prototype) {
            return HomeBlockDotPattern.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == HomeBlockDotPattern.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static HomeBlockDotPattern getDefaultInstance() {
            return HomeBlockDotPattern.DEFAULT_INSTANCE;
        }
        
        public static Parser<HomeBlockDotPattern> parser() {
            return HomeBlockDotPattern.PARSER;
        }
        
        @Override
        public Parser<HomeBlockDotPattern> getParserForType() {
            return HomeBlockDotPattern.PARSER;
        }
        
        @Override
        public HomeBlockDotPattern getDefaultInstanceForType() {
            return HomeBlockDotPattern.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new HomeBlockDotPattern();
            PARSER = new AbstractParser<HomeBlockDotPattern>() {
                @Override
                public HomeBlockDotPattern parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new HomeBlockDotPattern(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HomeBlockDotPatternOrBuilder
        {
            private int width_;
            private int height_;
            private ByteString data_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return HomeBlockDotPatternOuterClass.internal_static_HomeBlockDotPattern_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HomeBlockDotPatternOuterClass.internal_static_HomeBlockDotPattern_fieldAccessorTable.ensureFieldAccessorsInitialized(HomeBlockDotPattern.class, Builder.class);
            }
            
            private Builder() {
                this.data_ = ByteString.EMPTY;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.data_ = ByteString.EMPTY;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (HomeBlockDotPattern.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.width_ = 0;
                this.height_ = 0;
                this.data_ = ByteString.EMPTY;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return HomeBlockDotPatternOuterClass.internal_static_HomeBlockDotPattern_descriptor;
            }
            
            @Override
            public HomeBlockDotPattern getDefaultInstanceForType() {
                return HomeBlockDotPattern.getDefaultInstance();
            }
            
            @Override
            public HomeBlockDotPattern build() {
                final HomeBlockDotPattern result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public HomeBlockDotPattern buildPartial() {
                final HomeBlockDotPattern result = new HomeBlockDotPattern(this);
                result.width_ = this.width_;
                result.height_ = this.height_;
                result.data_ = this.data_;
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
                if (other instanceof HomeBlockDotPattern) {
                    return this.mergeFrom((HomeBlockDotPattern)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final HomeBlockDotPattern other) {
                if (other == HomeBlockDotPattern.getDefaultInstance()) {
                    return this;
                }
                if (other.getWidth() != 0) {
                    this.setWidth(other.getWidth());
                }
                if (other.getHeight() != 0) {
                    this.setHeight(other.getHeight());
                }
                if (other.getData() != ByteString.EMPTY) {
                    this.setData(other.getData());
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
                HomeBlockDotPattern parsedMessage = null;
                try {
                    parsedMessage = HomeBlockDotPattern.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (HomeBlockDotPattern)e.getUnfinishedMessage();
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
            public int getWidth() {
                return this.width_;
            }
            
            public Builder setWidth(final int value) {
                this.width_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearWidth() {
                this.width_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getHeight() {
                return this.height_;
            }
            
            public Builder setHeight(final int value) {
                this.height_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearHeight() {
                this.height_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public ByteString getData() {
                return this.data_;
            }
            
            public Builder setData(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.data_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearData() {
                this.data_ = HomeBlockDotPattern.getDefaultInstance().getData();
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
    
    public interface HomeBlockDotPatternOrBuilder extends MessageOrBuilder
    {
        int getWidth();
        
        int getHeight();
        
        ByteString getData();
    }
}
