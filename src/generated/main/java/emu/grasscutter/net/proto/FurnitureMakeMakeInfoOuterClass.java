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

public final class FurnitureMakeMakeInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_FurnitureMakeMakeInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_FurnitureMakeMakeInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private FurnitureMakeMakeInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FurnitureMakeMakeInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bFurnitureMakeMakeInfo.proto\"A\n\u0015FurnitureMakeMakeInfo\u0012\u0014\n\ffurniture_id\u0018\r \u0001(\r\u0012\u0012\n\nmake_count\u0018\t \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FurnitureMakeMakeInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_FurnitureMakeMakeInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FurnitureMakeMakeInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(FurnitureMakeMakeInfoOuterClass.internal_static_FurnitureMakeMakeInfo_descriptor, new String[] { "FurnitureId", "MakeCount" });
    }
    
    public static final class FurnitureMakeMakeInfo extends GeneratedMessageV3 implements FurnitureMakeMakeInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FURNITURE_ID_FIELD_NUMBER = 13;
        private int furnitureId_;
        public static final int MAKE_COUNT_FIELD_NUMBER = 9;
        private int makeCount_;
        private byte memoizedIsInitialized;
        private static final FurnitureMakeMakeInfo DEFAULT_INSTANCE;
        private static final Parser<FurnitureMakeMakeInfo> PARSER;
        
        private FurnitureMakeMakeInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private FurnitureMakeMakeInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new FurnitureMakeMakeInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private FurnitureMakeMakeInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 72: {
                            this.makeCount_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.furnitureId_ = input.readUInt32();
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
            return FurnitureMakeMakeInfoOuterClass.internal_static_FurnitureMakeMakeInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return FurnitureMakeMakeInfoOuterClass.internal_static_FurnitureMakeMakeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(FurnitureMakeMakeInfo.class, Builder.class);
        }
        
        @Override
        public int getFurnitureId() {
            return this.furnitureId_;
        }
        
        @Override
        public int getMakeCount() {
            return this.makeCount_;
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
            if (this.makeCount_ != 0) {
                output.writeUInt32(9, this.makeCount_);
            }
            if (this.furnitureId_ != 0) {
                output.writeUInt32(13, this.furnitureId_);
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
            if (this.makeCount_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.makeCount_);
            }
            if (this.furnitureId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.furnitureId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FurnitureMakeMakeInfo)) {
                return super.equals(obj);
            }
            final FurnitureMakeMakeInfo other = (FurnitureMakeMakeInfo)obj;
            return this.getFurnitureId() == other.getFurnitureId() && this.getMakeCount() == other.getMakeCount() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getFurnitureId();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getMakeCount();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static FurnitureMakeMakeInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return FurnitureMakeMakeInfo.PARSER.parseFrom(data);
        }
        
        public static FurnitureMakeMakeInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FurnitureMakeMakeInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FurnitureMakeMakeInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return FurnitureMakeMakeInfo.PARSER.parseFrom(data);
        }
        
        public static FurnitureMakeMakeInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FurnitureMakeMakeInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FurnitureMakeMakeInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return FurnitureMakeMakeInfo.PARSER.parseFrom(data);
        }
        
        public static FurnitureMakeMakeInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FurnitureMakeMakeInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FurnitureMakeMakeInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeMakeInfo.PARSER, input);
        }
        
        public static FurnitureMakeMakeInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeMakeInfo.PARSER, input, extensionRegistry);
        }
        
        public static FurnitureMakeMakeInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FurnitureMakeMakeInfo.PARSER, input);
        }
        
        public static FurnitureMakeMakeInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FurnitureMakeMakeInfo.PARSER, input, extensionRegistry);
        }
        
        public static FurnitureMakeMakeInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeMakeInfo.PARSER, input);
        }
        
        public static FurnitureMakeMakeInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeMakeInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return FurnitureMakeMakeInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final FurnitureMakeMakeInfo prototype) {
            return FurnitureMakeMakeInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == FurnitureMakeMakeInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static FurnitureMakeMakeInfo getDefaultInstance() {
            return FurnitureMakeMakeInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<FurnitureMakeMakeInfo> parser() {
            return FurnitureMakeMakeInfo.PARSER;
        }
        
        @Override
        public Parser<FurnitureMakeMakeInfo> getParserForType() {
            return FurnitureMakeMakeInfo.PARSER;
        }
        
        @Override
        public FurnitureMakeMakeInfo getDefaultInstanceForType() {
            return FurnitureMakeMakeInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new FurnitureMakeMakeInfo();
            PARSER = new AbstractParser<FurnitureMakeMakeInfo>() {
                @Override
                public FurnitureMakeMakeInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new FurnitureMakeMakeInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FurnitureMakeMakeInfoOrBuilder
        {
            private int furnitureId_;
            private int makeCount_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return FurnitureMakeMakeInfoOuterClass.internal_static_FurnitureMakeMakeInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return FurnitureMakeMakeInfoOuterClass.internal_static_FurnitureMakeMakeInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(FurnitureMakeMakeInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (FurnitureMakeMakeInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.furnitureId_ = 0;
                this.makeCount_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return FurnitureMakeMakeInfoOuterClass.internal_static_FurnitureMakeMakeInfo_descriptor;
            }
            
            @Override
            public FurnitureMakeMakeInfo getDefaultInstanceForType() {
                return FurnitureMakeMakeInfo.getDefaultInstance();
            }
            
            @Override
            public FurnitureMakeMakeInfo build() {
                final FurnitureMakeMakeInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public FurnitureMakeMakeInfo buildPartial() {
                final FurnitureMakeMakeInfo result = new FurnitureMakeMakeInfo(this);
                result.furnitureId_ = this.furnitureId_;
                result.makeCount_ = this.makeCount_;
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
                if (other instanceof FurnitureMakeMakeInfo) {
                    return this.mergeFrom((FurnitureMakeMakeInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final FurnitureMakeMakeInfo other) {
                if (other == FurnitureMakeMakeInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getFurnitureId() != 0) {
                    this.setFurnitureId(other.getFurnitureId());
                }
                if (other.getMakeCount() != 0) {
                    this.setMakeCount(other.getMakeCount());
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
                FurnitureMakeMakeInfo parsedMessage = null;
                try {
                    parsedMessage = FurnitureMakeMakeInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (FurnitureMakeMakeInfo)e.getUnfinishedMessage();
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
            public int getFurnitureId() {
                return this.furnitureId_;
            }
            
            public Builder setFurnitureId(final int value) {
                this.furnitureId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFurnitureId() {
                this.furnitureId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getMakeCount() {
                return this.makeCount_;
            }
            
            public Builder setMakeCount(final int value) {
                this.makeCount_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMakeCount() {
                this.makeCount_ = 0;
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
    
    public interface FurnitureMakeMakeInfoOrBuilder extends MessageOrBuilder
    {
        int getFurnitureId();
        
        int getMakeCount();
    }
}
