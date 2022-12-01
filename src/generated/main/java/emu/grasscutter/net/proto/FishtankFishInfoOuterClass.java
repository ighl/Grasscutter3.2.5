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

public final class FishtankFishInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_FishtankFishInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_FishtankFishInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private FishtankFishInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FishtankFishInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016FishtankFishInfo.proto\"i\n\u0010FishtankFishInfo\u0012\u001b\n\u0013Unk3000_KNOBDDHIONH\u0018\u0001 \u0001(\u0002\u0012\u001b\n\u0013Unk3000_NDBJCJEIEEO\u0018\u0002 \u0001(\u0002\u0012\u001b\n\u0013Unk3000_CGBHKPEGBOD\u0018\u0003 \u0001(\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FishtankFishInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_FishtankFishInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FishtankFishInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(FishtankFishInfoOuterClass.internal_static_FishtankFishInfo_descriptor, new String[] { "Unk3000KNOBDDHIONH", "Unk3000NDBJCJEIEEO", "Unk3000CGBHKPEGBOD" });
    }
    
    public static final class FishtankFishInfo extends GeneratedMessageV3 implements FishtankFishInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int UNK3000_KNOBDDHIONH_FIELD_NUMBER = 1;
        private float unk3000KNOBDDHIONH_;
        public static final int UNK3000_NDBJCJEIEEO_FIELD_NUMBER = 2;
        private float unk3000NDBJCJEIEEO_;
        public static final int UNK3000_CGBHKPEGBOD_FIELD_NUMBER = 3;
        private float unk3000CGBHKPEGBOD_;
        private byte memoizedIsInitialized;
        private static final FishtankFishInfo DEFAULT_INSTANCE;
        private static final Parser<FishtankFishInfo> PARSER;
        
        private FishtankFishInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private FishtankFishInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new FishtankFishInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private FishtankFishInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 13: {
                            this.unk3000KNOBDDHIONH_ = input.readFloat();
                            continue;
                        }
                        case 21: {
                            this.unk3000NDBJCJEIEEO_ = input.readFloat();
                            continue;
                        }
                        case 29: {
                            this.unk3000CGBHKPEGBOD_ = input.readFloat();
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
            return FishtankFishInfoOuterClass.internal_static_FishtankFishInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return FishtankFishInfoOuterClass.internal_static_FishtankFishInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(FishtankFishInfo.class, Builder.class);
        }
        
        @Override
        public float getUnk3000KNOBDDHIONH() {
            return this.unk3000KNOBDDHIONH_;
        }
        
        @Override
        public float getUnk3000NDBJCJEIEEO() {
            return this.unk3000NDBJCJEIEEO_;
        }
        
        @Override
        public float getUnk3000CGBHKPEGBOD() {
            return this.unk3000CGBHKPEGBOD_;
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
            if (this.unk3000KNOBDDHIONH_ != 0.0f) {
                output.writeFloat(1, this.unk3000KNOBDDHIONH_);
            }
            if (this.unk3000NDBJCJEIEEO_ != 0.0f) {
                output.writeFloat(2, this.unk3000NDBJCJEIEEO_);
            }
            if (this.unk3000CGBHKPEGBOD_ != 0.0f) {
                output.writeFloat(3, this.unk3000CGBHKPEGBOD_);
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
            if (this.unk3000KNOBDDHIONH_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(1, this.unk3000KNOBDDHIONH_);
            }
            if (this.unk3000NDBJCJEIEEO_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(2, this.unk3000NDBJCJEIEEO_);
            }
            if (this.unk3000CGBHKPEGBOD_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(3, this.unk3000CGBHKPEGBOD_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FishtankFishInfo)) {
                return super.equals(obj);
            }
            final FishtankFishInfo other = (FishtankFishInfo)obj;
            return Float.floatToIntBits(this.getUnk3000KNOBDDHIONH()) == Float.floatToIntBits(other.getUnk3000KNOBDDHIONH()) && Float.floatToIntBits(this.getUnk3000NDBJCJEIEEO()) == Float.floatToIntBits(other.getUnk3000NDBJCJEIEEO()) && Float.floatToIntBits(this.getUnk3000CGBHKPEGBOD()) == Float.floatToIntBits(other.getUnk3000CGBHKPEGBOD()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + Float.floatToIntBits(this.getUnk3000KNOBDDHIONH());
            hash = 37 * hash + 2;
            hash = 53 * hash + Float.floatToIntBits(this.getUnk3000NDBJCJEIEEO());
            hash = 37 * hash + 3;
            hash = 53 * hash + Float.floatToIntBits(this.getUnk3000CGBHKPEGBOD());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static FishtankFishInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return FishtankFishInfo.PARSER.parseFrom(data);
        }
        
        public static FishtankFishInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FishtankFishInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FishtankFishInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return FishtankFishInfo.PARSER.parseFrom(data);
        }
        
        public static FishtankFishInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FishtankFishInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FishtankFishInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return FishtankFishInfo.PARSER.parseFrom(data);
        }
        
        public static FishtankFishInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FishtankFishInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FishtankFishInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FishtankFishInfo.PARSER, input);
        }
        
        public static FishtankFishInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FishtankFishInfo.PARSER, input, extensionRegistry);
        }
        
        public static FishtankFishInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FishtankFishInfo.PARSER, input);
        }
        
        public static FishtankFishInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FishtankFishInfo.PARSER, input, extensionRegistry);
        }
        
        public static FishtankFishInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FishtankFishInfo.PARSER, input);
        }
        
        public static FishtankFishInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FishtankFishInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return FishtankFishInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final FishtankFishInfo prototype) {
            return FishtankFishInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == FishtankFishInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static FishtankFishInfo getDefaultInstance() {
            return FishtankFishInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<FishtankFishInfo> parser() {
            return FishtankFishInfo.PARSER;
        }
        
        @Override
        public Parser<FishtankFishInfo> getParserForType() {
            return FishtankFishInfo.PARSER;
        }
        
        @Override
        public FishtankFishInfo getDefaultInstanceForType() {
            return FishtankFishInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new FishtankFishInfo();
            PARSER = new AbstractParser<FishtankFishInfo>() {
                @Override
                public FishtankFishInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new FishtankFishInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FishtankFishInfoOrBuilder
        {
            private float unk3000KNOBDDHIONH_;
            private float unk3000NDBJCJEIEEO_;
            private float unk3000CGBHKPEGBOD_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return FishtankFishInfoOuterClass.internal_static_FishtankFishInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return FishtankFishInfoOuterClass.internal_static_FishtankFishInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(FishtankFishInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (FishtankFishInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.unk3000KNOBDDHIONH_ = 0.0f;
                this.unk3000NDBJCJEIEEO_ = 0.0f;
                this.unk3000CGBHKPEGBOD_ = 0.0f;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return FishtankFishInfoOuterClass.internal_static_FishtankFishInfo_descriptor;
            }
            
            @Override
            public FishtankFishInfo getDefaultInstanceForType() {
                return FishtankFishInfo.getDefaultInstance();
            }
            
            @Override
            public FishtankFishInfo build() {
                final FishtankFishInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public FishtankFishInfo buildPartial() {
                final FishtankFishInfo result = new FishtankFishInfo(this);
                result.unk3000KNOBDDHIONH_ = this.unk3000KNOBDDHIONH_;
                result.unk3000NDBJCJEIEEO_ = this.unk3000NDBJCJEIEEO_;
                result.unk3000CGBHKPEGBOD_ = this.unk3000CGBHKPEGBOD_;
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
                if (other instanceof FishtankFishInfo) {
                    return this.mergeFrom((FishtankFishInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final FishtankFishInfo other) {
                if (other == FishtankFishInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getUnk3000KNOBDDHIONH() != 0.0f) {
                    this.setUnk3000KNOBDDHIONH(other.getUnk3000KNOBDDHIONH());
                }
                if (other.getUnk3000NDBJCJEIEEO() != 0.0f) {
                    this.setUnk3000NDBJCJEIEEO(other.getUnk3000NDBJCJEIEEO());
                }
                if (other.getUnk3000CGBHKPEGBOD() != 0.0f) {
                    this.setUnk3000CGBHKPEGBOD(other.getUnk3000CGBHKPEGBOD());
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
                FishtankFishInfo parsedMessage = null;
                try {
                    parsedMessage = FishtankFishInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (FishtankFishInfo)e.getUnfinishedMessage();
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
            public float getUnk3000KNOBDDHIONH() {
                return this.unk3000KNOBDDHIONH_;
            }
            
            public Builder setUnk3000KNOBDDHIONH(final float value) {
                this.unk3000KNOBDDHIONH_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk3000KNOBDDHIONH() {
                this.unk3000KNOBDDHIONH_ = 0.0f;
                this.onChanged();
                return this;
            }
            
            @Override
            public float getUnk3000NDBJCJEIEEO() {
                return this.unk3000NDBJCJEIEEO_;
            }
            
            public Builder setUnk3000NDBJCJEIEEO(final float value) {
                this.unk3000NDBJCJEIEEO_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk3000NDBJCJEIEEO() {
                this.unk3000NDBJCJEIEEO_ = 0.0f;
                this.onChanged();
                return this;
            }
            
            @Override
            public float getUnk3000CGBHKPEGBOD() {
                return this.unk3000CGBHKPEGBOD_;
            }
            
            public Builder setUnk3000CGBHKPEGBOD(final float value) {
                this.unk3000CGBHKPEGBOD_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk3000CGBHKPEGBOD() {
                this.unk3000CGBHKPEGBOD_ = 0.0f;
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
    
    public interface FishtankFishInfoOrBuilder extends MessageOrBuilder
    {
        float getUnk3000KNOBDDHIONH();
        
        float getUnk3000NDBJCJEIEEO();
        
        float getUnk3000CGBHKPEGBOD();
    }
}
