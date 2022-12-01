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

public final class FurnitureMakeHelpDataOuterClass
{
    private static final Descriptors.Descriptor internal_static_FurnitureMakeHelpData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_FurnitureMakeHelpData_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private FurnitureMakeHelpDataOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return FurnitureMakeHelpDataOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bFurnitureMakeHelpData.proto\"3\n\u0015FurnitureMakeHelpData\u0012\r\n\u0005times\u0018\u0002 \u0001(\r\u0012\u000b\n\u0003uid\u0018\r \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        FurnitureMakeHelpDataOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_FurnitureMakeHelpData_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FurnitureMakeHelpData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(FurnitureMakeHelpDataOuterClass.internal_static_FurnitureMakeHelpData_descriptor, new String[] { "Times", "Uid" });
    }
    
    public static final class FurnitureMakeHelpData extends GeneratedMessageV3 implements FurnitureMakeHelpDataOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TIMES_FIELD_NUMBER = 2;
        private int times_;
        public static final int UID_FIELD_NUMBER = 13;
        private int uid_;
        private byte memoizedIsInitialized;
        private static final FurnitureMakeHelpData DEFAULT_INSTANCE;
        private static final Parser<FurnitureMakeHelpData> PARSER;
        
        private FurnitureMakeHelpData(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private FurnitureMakeHelpData() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new FurnitureMakeHelpData();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private FurnitureMakeHelpData(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            this.times_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.uid_ = input.readUInt32();
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
            return FurnitureMakeHelpDataOuterClass.internal_static_FurnitureMakeHelpData_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return FurnitureMakeHelpDataOuterClass.internal_static_FurnitureMakeHelpData_fieldAccessorTable.ensureFieldAccessorsInitialized(FurnitureMakeHelpData.class, Builder.class);
        }
        
        @Override
        public int getTimes() {
            return this.times_;
        }
        
        @Override
        public int getUid() {
            return this.uid_;
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
            if (this.times_ != 0) {
                output.writeUInt32(2, this.times_);
            }
            if (this.uid_ != 0) {
                output.writeUInt32(13, this.uid_);
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
            if (this.times_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.times_);
            }
            if (this.uid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.uid_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FurnitureMakeHelpData)) {
                return super.equals(obj);
            }
            final FurnitureMakeHelpData other = (FurnitureMakeHelpData)obj;
            return this.getTimes() == other.getTimes() && this.getUid() == other.getUid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getTimes();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getUid();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static FurnitureMakeHelpData parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return FurnitureMakeHelpData.PARSER.parseFrom(data);
        }
        
        public static FurnitureMakeHelpData parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FurnitureMakeHelpData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FurnitureMakeHelpData parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return FurnitureMakeHelpData.PARSER.parseFrom(data);
        }
        
        public static FurnitureMakeHelpData parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FurnitureMakeHelpData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FurnitureMakeHelpData parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return FurnitureMakeHelpData.PARSER.parseFrom(data);
        }
        
        public static FurnitureMakeHelpData parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return FurnitureMakeHelpData.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static FurnitureMakeHelpData parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeHelpData.PARSER, input);
        }
        
        public static FurnitureMakeHelpData parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeHelpData.PARSER, input, extensionRegistry);
        }
        
        public static FurnitureMakeHelpData parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FurnitureMakeHelpData.PARSER, input);
        }
        
        public static FurnitureMakeHelpData parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(FurnitureMakeHelpData.PARSER, input, extensionRegistry);
        }
        
        public static FurnitureMakeHelpData parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeHelpData.PARSER, input);
        }
        
        public static FurnitureMakeHelpData parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(FurnitureMakeHelpData.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return FurnitureMakeHelpData.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final FurnitureMakeHelpData prototype) {
            return FurnitureMakeHelpData.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == FurnitureMakeHelpData.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static FurnitureMakeHelpData getDefaultInstance() {
            return FurnitureMakeHelpData.DEFAULT_INSTANCE;
        }
        
        public static Parser<FurnitureMakeHelpData> parser() {
            return FurnitureMakeHelpData.PARSER;
        }
        
        @Override
        public Parser<FurnitureMakeHelpData> getParserForType() {
            return FurnitureMakeHelpData.PARSER;
        }
        
        @Override
        public FurnitureMakeHelpData getDefaultInstanceForType() {
            return FurnitureMakeHelpData.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new FurnitureMakeHelpData();
            PARSER = new AbstractParser<FurnitureMakeHelpData>() {
                @Override
                public FurnitureMakeHelpData parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new FurnitureMakeHelpData(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FurnitureMakeHelpDataOrBuilder
        {
            private int times_;
            private int uid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return FurnitureMakeHelpDataOuterClass.internal_static_FurnitureMakeHelpData_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return FurnitureMakeHelpDataOuterClass.internal_static_FurnitureMakeHelpData_fieldAccessorTable.ensureFieldAccessorsInitialized(FurnitureMakeHelpData.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (FurnitureMakeHelpData.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.times_ = 0;
                this.uid_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return FurnitureMakeHelpDataOuterClass.internal_static_FurnitureMakeHelpData_descriptor;
            }
            
            @Override
            public FurnitureMakeHelpData getDefaultInstanceForType() {
                return FurnitureMakeHelpData.getDefaultInstance();
            }
            
            @Override
            public FurnitureMakeHelpData build() {
                final FurnitureMakeHelpData result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public FurnitureMakeHelpData buildPartial() {
                final FurnitureMakeHelpData result = new FurnitureMakeHelpData(this);
                result.times_ = this.times_;
                result.uid_ = this.uid_;
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
                if (other instanceof FurnitureMakeHelpData) {
                    return this.mergeFrom((FurnitureMakeHelpData)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final FurnitureMakeHelpData other) {
                if (other == FurnitureMakeHelpData.getDefaultInstance()) {
                    return this;
                }
                if (other.getTimes() != 0) {
                    this.setTimes(other.getTimes());
                }
                if (other.getUid() != 0) {
                    this.setUid(other.getUid());
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
                FurnitureMakeHelpData parsedMessage = null;
                try {
                    parsedMessage = FurnitureMakeHelpData.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (FurnitureMakeHelpData)e.getUnfinishedMessage();
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
            public int getTimes() {
                return this.times_;
            }
            
            public Builder setTimes(final int value) {
                this.times_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTimes() {
                this.times_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUid() {
                return this.uid_;
            }
            
            public Builder setUid(final int value) {
                this.uid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUid() {
                this.uid_ = 0;
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
    
    public interface FurnitureMakeHelpDataOrBuilder extends MessageOrBuilder
    {
        int getTimes();
        
        int getUid();
    }
}
