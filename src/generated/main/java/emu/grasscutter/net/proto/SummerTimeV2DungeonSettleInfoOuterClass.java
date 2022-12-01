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
import com.google.protobuf.Internal;
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

public final class SummerTimeV2DungeonSettleInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_SummerTimeV2DungeonSettleInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SummerTimeV2DungeonSettleInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SummerTimeV2DungeonSettleInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SummerTimeV2DungeonSettleInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n#SummerTimeV2DungeonSettleInfo.proto\"m\n\u001dSummerTimeV2DungeonSettleInfo\u0012\u0012\n\nis_success\u0018\u0005 \u0001(\b\u0012\u001b\n\u0013Unk2800_ELHBCNPKOJG\u0018\u0002 \u0001(\r\u0012\u001b\n\u0013Unk2800_HDEFJKGDNEH\u0018\u000b \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SummerTimeV2DungeonSettleInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_SummerTimeV2DungeonSettleInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SummerTimeV2DungeonSettleInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SummerTimeV2DungeonSettleInfoOuterClass.internal_static_SummerTimeV2DungeonSettleInfo_descriptor, new String[] { "IsSuccess", "Unk2800ELHBCNPKOJG", "Unk2800HDEFJKGDNEH" });
    }
    
    public static final class SummerTimeV2DungeonSettleInfo extends GeneratedMessageV3 implements SummerTimeV2DungeonSettleInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int IS_SUCCESS_FIELD_NUMBER = 5;
        private boolean isSuccess_;
        public static final int UNK2800_ELHBCNPKOJG_FIELD_NUMBER = 2;
        private int unk2800ELHBCNPKOJG_;
        public static final int UNK2800_HDEFJKGDNEH_FIELD_NUMBER = 11;
        private int unk2800HDEFJKGDNEH_;
        private byte memoizedIsInitialized;
        private static final SummerTimeV2DungeonSettleInfo DEFAULT_INSTANCE;
        private static final Parser<SummerTimeV2DungeonSettleInfo> PARSER;
        
        private SummerTimeV2DungeonSettleInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SummerTimeV2DungeonSettleInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SummerTimeV2DungeonSettleInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SummerTimeV2DungeonSettleInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.unk2800ELHBCNPKOJG_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.isSuccess_ = input.readBool();
                            continue;
                        }
                        case 88: {
                            this.unk2800HDEFJKGDNEH_ = input.readUInt32();
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
            return SummerTimeV2DungeonSettleInfoOuterClass.internal_static_SummerTimeV2DungeonSettleInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SummerTimeV2DungeonSettleInfoOuterClass.internal_static_SummerTimeV2DungeonSettleInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SummerTimeV2DungeonSettleInfo.class, Builder.class);
        }
        
        @Override
        public boolean getIsSuccess() {
            return this.isSuccess_;
        }
        
        @Override
        public int getUnk2800ELHBCNPKOJG() {
            return this.unk2800ELHBCNPKOJG_;
        }
        
        @Override
        public int getUnk2800HDEFJKGDNEH() {
            return this.unk2800HDEFJKGDNEH_;
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
            if (this.unk2800ELHBCNPKOJG_ != 0) {
                output.writeUInt32(2, this.unk2800ELHBCNPKOJG_);
            }
            if (this.isSuccess_) {
                output.writeBool(5, this.isSuccess_);
            }
            if (this.unk2800HDEFJKGDNEH_ != 0) {
                output.writeUInt32(11, this.unk2800HDEFJKGDNEH_);
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
            if (this.unk2800ELHBCNPKOJG_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.unk2800ELHBCNPKOJG_);
            }
            if (this.isSuccess_) {
                size += CodedOutputStream.computeBoolSize(5, this.isSuccess_);
            }
            if (this.unk2800HDEFJKGDNEH_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.unk2800HDEFJKGDNEH_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SummerTimeV2DungeonSettleInfo)) {
                return super.equals(obj);
            }
            final SummerTimeV2DungeonSettleInfo other = (SummerTimeV2DungeonSettleInfo)obj;
            return this.getIsSuccess() == other.getIsSuccess() && this.getUnk2800ELHBCNPKOJG() == other.getUnk2800ELHBCNPKOJG() && this.getUnk2800HDEFJKGDNEH() == other.getUnk2800HDEFJKGDNEH() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 5;
            hash = 53 * hash + Internal.hashBoolean(this.getIsSuccess());
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getUnk2800ELHBCNPKOJG();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getUnk2800HDEFJKGDNEH();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SummerTimeV2DungeonSettleInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SummerTimeV2DungeonSettleInfo.PARSER.parseFrom(data);
        }
        
        public static SummerTimeV2DungeonSettleInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SummerTimeV2DungeonSettleInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SummerTimeV2DungeonSettleInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SummerTimeV2DungeonSettleInfo.PARSER.parseFrom(data);
        }
        
        public static SummerTimeV2DungeonSettleInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SummerTimeV2DungeonSettleInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SummerTimeV2DungeonSettleInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SummerTimeV2DungeonSettleInfo.PARSER.parseFrom(data);
        }
        
        public static SummerTimeV2DungeonSettleInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SummerTimeV2DungeonSettleInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SummerTimeV2DungeonSettleInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SummerTimeV2DungeonSettleInfo.PARSER, input);
        }
        
        public static SummerTimeV2DungeonSettleInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SummerTimeV2DungeonSettleInfo.PARSER, input, extensionRegistry);
        }
        
        public static SummerTimeV2DungeonSettleInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SummerTimeV2DungeonSettleInfo.PARSER, input);
        }
        
        public static SummerTimeV2DungeonSettleInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SummerTimeV2DungeonSettleInfo.PARSER, input, extensionRegistry);
        }
        
        public static SummerTimeV2DungeonSettleInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SummerTimeV2DungeonSettleInfo.PARSER, input);
        }
        
        public static SummerTimeV2DungeonSettleInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SummerTimeV2DungeonSettleInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SummerTimeV2DungeonSettleInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SummerTimeV2DungeonSettleInfo prototype) {
            return SummerTimeV2DungeonSettleInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SummerTimeV2DungeonSettleInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SummerTimeV2DungeonSettleInfo getDefaultInstance() {
            return SummerTimeV2DungeonSettleInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<SummerTimeV2DungeonSettleInfo> parser() {
            return SummerTimeV2DungeonSettleInfo.PARSER;
        }
        
        @Override
        public Parser<SummerTimeV2DungeonSettleInfo> getParserForType() {
            return SummerTimeV2DungeonSettleInfo.PARSER;
        }
        
        @Override
        public SummerTimeV2DungeonSettleInfo getDefaultInstanceForType() {
            return SummerTimeV2DungeonSettleInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SummerTimeV2DungeonSettleInfo();
            PARSER = new AbstractParser<SummerTimeV2DungeonSettleInfo>() {
                @Override
                public SummerTimeV2DungeonSettleInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SummerTimeV2DungeonSettleInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SummerTimeV2DungeonSettleInfoOrBuilder
        {
            private boolean isSuccess_;
            private int unk2800ELHBCNPKOJG_;
            private int unk2800HDEFJKGDNEH_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SummerTimeV2DungeonSettleInfoOuterClass.internal_static_SummerTimeV2DungeonSettleInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SummerTimeV2DungeonSettleInfoOuterClass.internal_static_SummerTimeV2DungeonSettleInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SummerTimeV2DungeonSettleInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SummerTimeV2DungeonSettleInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.isSuccess_ = false;
                this.unk2800ELHBCNPKOJG_ = 0;
                this.unk2800HDEFJKGDNEH_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SummerTimeV2DungeonSettleInfoOuterClass.internal_static_SummerTimeV2DungeonSettleInfo_descriptor;
            }
            
            @Override
            public SummerTimeV2DungeonSettleInfo getDefaultInstanceForType() {
                return SummerTimeV2DungeonSettleInfo.getDefaultInstance();
            }
            
            @Override
            public SummerTimeV2DungeonSettleInfo build() {
                final SummerTimeV2DungeonSettleInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SummerTimeV2DungeonSettleInfo buildPartial() {
                final SummerTimeV2DungeonSettleInfo result = new SummerTimeV2DungeonSettleInfo(this);
                result.isSuccess_ = this.isSuccess_;
                result.unk2800ELHBCNPKOJG_ = this.unk2800ELHBCNPKOJG_;
                result.unk2800HDEFJKGDNEH_ = this.unk2800HDEFJKGDNEH_;
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
                if (other instanceof SummerTimeV2DungeonSettleInfo) {
                    return this.mergeFrom((SummerTimeV2DungeonSettleInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SummerTimeV2DungeonSettleInfo other) {
                if (other == SummerTimeV2DungeonSettleInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getIsSuccess()) {
                    this.setIsSuccess(other.getIsSuccess());
                }
                if (other.getUnk2800ELHBCNPKOJG() != 0) {
                    this.setUnk2800ELHBCNPKOJG(other.getUnk2800ELHBCNPKOJG());
                }
                if (other.getUnk2800HDEFJKGDNEH() != 0) {
                    this.setUnk2800HDEFJKGDNEH(other.getUnk2800HDEFJKGDNEH());
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
                SummerTimeV2DungeonSettleInfo parsedMessage = null;
                try {
                    parsedMessage = SummerTimeV2DungeonSettleInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SummerTimeV2DungeonSettleInfo)e.getUnfinishedMessage();
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
            public boolean getIsSuccess() {
                return this.isSuccess_;
            }
            
            public Builder setIsSuccess(final boolean value) {
                this.isSuccess_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsSuccess() {
                this.isSuccess_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2800ELHBCNPKOJG() {
                return this.unk2800ELHBCNPKOJG_;
            }
            
            public Builder setUnk2800ELHBCNPKOJG(final int value) {
                this.unk2800ELHBCNPKOJG_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2800ELHBCNPKOJG() {
                this.unk2800ELHBCNPKOJG_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2800HDEFJKGDNEH() {
                return this.unk2800HDEFJKGDNEH_;
            }
            
            public Builder setUnk2800HDEFJKGDNEH(final int value) {
                this.unk2800HDEFJKGDNEH_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2800HDEFJKGDNEH() {
                this.unk2800HDEFJKGDNEH_ = 0;
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
    
    public interface SummerTimeV2DungeonSettleInfoOrBuilder extends MessageOrBuilder
    {
        boolean getIsSuccess();
        
        int getUnk2800ELHBCNPKOJG();
        
        int getUnk2800HDEFJKGDNEH();
    }
}
