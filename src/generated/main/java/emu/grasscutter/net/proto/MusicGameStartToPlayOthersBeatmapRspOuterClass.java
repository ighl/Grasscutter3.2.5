// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class MusicGameStartToPlayOthersBeatmapRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_MusicGameStartToPlayOthersBeatmapRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MusicGameStartToPlayOthersBeatmapRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MusicGameStartToPlayOthersBeatmapRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MusicGameStartToPlayOthersBeatmapRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n*MusicGameStartToPlayOthersBeatmapRsp.proto\u001a\u001bMusicGameUnknown1Enum.proto\"{\n$MusicGameStartToPlayOthersBeatmapRsp\u0012\u000f\n\u0007retcode\u0018\u0002 \u0001(\u0005\u0012-\n\runknown_enum1\u0018\u000b \u0001(\u000e2\u0016.MusicGameUnknown1Enum\u0012\u0013\n\u000bAMNODOLNOIM\u0018\u0006 \u0003(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MusicGameStartToPlayOthersBeatmapRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MusicGameUnknown1EnumOuterClass.getDescriptor() });
        internal_static_MusicGameStartToPlayOthersBeatmapRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MusicGameStartToPlayOthersBeatmapRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MusicGameStartToPlayOthersBeatmapRspOuterClass.internal_static_MusicGameStartToPlayOthersBeatmapRsp_descriptor, new String[] { "Retcode", "UnknownEnum1", "AMNODOLNOIM" });
        MusicGameUnknown1EnumOuterClass.getDescriptor();
    }
    
    public static final class MusicGameStartToPlayOthersBeatmapRsp extends GeneratedMessageV3 implements MusicGameStartToPlayOthersBeatmapRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 2;
        private int retcode_;
        public static final int UNKNOWN_ENUM1_FIELD_NUMBER = 11;
        private int unknownEnum1_;
        public static final int AMNODOLNOIM_FIELD_NUMBER = 6;
        private Internal.LongList aMNODOLNOIM_;
        private int aMNODOLNOIMMemoizedSerializedSize;
        private byte memoizedIsInitialized;
        private static final MusicGameStartToPlayOthersBeatmapRsp DEFAULT_INSTANCE;
        private static final Parser<MusicGameStartToPlayOthersBeatmapRsp> PARSER;
        
        private MusicGameStartToPlayOthersBeatmapRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.aMNODOLNOIMMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private MusicGameStartToPlayOthersBeatmapRsp() {
            this.aMNODOLNOIMMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.unknownEnum1_ = 0;
            this.aMNODOLNOIM_ = GeneratedMessageV3.emptyLongList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MusicGameStartToPlayOthersBeatmapRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MusicGameStartToPlayOthersBeatmapRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
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
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 48: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.aMNODOLNOIM_ = GeneratedMessageV3.newLongList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.aMNODOLNOIM_.addLong(input.readUInt64());
                            continue;
                        }
                        case 50: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.aMNODOLNOIM_ = GeneratedMessageV3.newLongList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.aMNODOLNOIM_.addLong(input.readUInt64());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 88: {
                            final int rawValue = input.readEnum();
                            this.unknownEnum1_ = rawValue;
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
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.aMNODOLNOIM_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return MusicGameStartToPlayOthersBeatmapRspOuterClass.internal_static_MusicGameStartToPlayOthersBeatmapRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MusicGameStartToPlayOthersBeatmapRspOuterClass.internal_static_MusicGameStartToPlayOthersBeatmapRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameStartToPlayOthersBeatmapRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public int getUnknownEnum1Value() {
            return this.unknownEnum1_;
        }
        
        @Override
        public MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum getUnknownEnum1() {
            final MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum result = MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.valueOf(this.unknownEnum1_);
            return (result == null) ? MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.UNRECOGNIZED : result;
        }
        
        @Override
        public List<Long> getAMNODOLNOIMList() {
            return this.aMNODOLNOIM_;
        }
        
        @Override
        public int getAMNODOLNOIMCount() {
            return this.aMNODOLNOIM_.size();
        }
        
        @Override
        public long getAMNODOLNOIM(final int index) {
            return this.aMNODOLNOIM_.getLong(index);
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
            this.getSerializedSize();
            if (this.retcode_ != 0) {
                output.writeInt32(2, this.retcode_);
            }
            if (this.getAMNODOLNOIMList().size() > 0) {
                output.writeUInt32NoTag(50);
                output.writeUInt32NoTag(this.aMNODOLNOIMMemoizedSerializedSize);
            }
            for (int i = 0; i < this.aMNODOLNOIM_.size(); ++i) {
                output.writeUInt64NoTag(this.aMNODOLNOIM_.getLong(i));
            }
            if (this.unknownEnum1_ != MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.MusicGameUnknown1Enum_NONE.getNumber()) {
                output.writeEnum(11, this.unknownEnum1_);
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
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(2, this.retcode_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.aMNODOLNOIM_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt64SizeNoTag(this.aMNODOLNOIM_.getLong(i));
            }
            size += dataSize;
            if (!this.getAMNODOLNOIMList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.aMNODOLNOIMMemoizedSerializedSize = dataSize;
            if (this.unknownEnum1_ != MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.MusicGameUnknown1Enum_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(11, this.unknownEnum1_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MusicGameStartToPlayOthersBeatmapRsp)) {
                return super.equals(obj);
            }
            final MusicGameStartToPlayOthersBeatmapRsp other = (MusicGameStartToPlayOthersBeatmapRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.unknownEnum1_ == other.unknownEnum1_ && this.getAMNODOLNOIMList().equals(other.getAMNODOLNOIMList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.unknownEnum1_;
            if (this.getAMNODOLNOIMCount() > 0) {
                hash = 37 * hash + 6;
                hash = 53 * hash + this.getAMNODOLNOIMList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MusicGameStartToPlayOthersBeatmapRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MusicGameStartToPlayOthersBeatmapRsp.PARSER.parseFrom(data);
        }
        
        public static MusicGameStartToPlayOthersBeatmapRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameStartToPlayOthersBeatmapRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameStartToPlayOthersBeatmapRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MusicGameStartToPlayOthersBeatmapRsp.PARSER.parseFrom(data);
        }
        
        public static MusicGameStartToPlayOthersBeatmapRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameStartToPlayOthersBeatmapRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameStartToPlayOthersBeatmapRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MusicGameStartToPlayOthersBeatmapRsp.PARSER.parseFrom(data);
        }
        
        public static MusicGameStartToPlayOthersBeatmapRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameStartToPlayOthersBeatmapRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameStartToPlayOthersBeatmapRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameStartToPlayOthersBeatmapRsp.PARSER, input);
        }
        
        public static MusicGameStartToPlayOthersBeatmapRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameStartToPlayOthersBeatmapRsp.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameStartToPlayOthersBeatmapRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameStartToPlayOthersBeatmapRsp.PARSER, input);
        }
        
        public static MusicGameStartToPlayOthersBeatmapRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameStartToPlayOthersBeatmapRsp.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameStartToPlayOthersBeatmapRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameStartToPlayOthersBeatmapRsp.PARSER, input);
        }
        
        public static MusicGameStartToPlayOthersBeatmapRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameStartToPlayOthersBeatmapRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MusicGameStartToPlayOthersBeatmapRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MusicGameStartToPlayOthersBeatmapRsp prototype) {
            return MusicGameStartToPlayOthersBeatmapRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MusicGameStartToPlayOthersBeatmapRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MusicGameStartToPlayOthersBeatmapRsp getDefaultInstance() {
            return MusicGameStartToPlayOthersBeatmapRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<MusicGameStartToPlayOthersBeatmapRsp> parser() {
            return MusicGameStartToPlayOthersBeatmapRsp.PARSER;
        }
        
        @Override
        public Parser<MusicGameStartToPlayOthersBeatmapRsp> getParserForType() {
            return MusicGameStartToPlayOthersBeatmapRsp.PARSER;
        }
        
        @Override
        public MusicGameStartToPlayOthersBeatmapRsp getDefaultInstanceForType() {
            return MusicGameStartToPlayOthersBeatmapRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MusicGameStartToPlayOthersBeatmapRsp();
            PARSER = new AbstractParser<MusicGameStartToPlayOthersBeatmapRsp>() {
                @Override
                public MusicGameStartToPlayOthersBeatmapRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MusicGameStartToPlayOthersBeatmapRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MusicGameStartToPlayOthersBeatmapRspOrBuilder
        {
            private int bitField0_;
            private int retcode_;
            private int unknownEnum1_;
            private Internal.LongList aMNODOLNOIM_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MusicGameStartToPlayOthersBeatmapRspOuterClass.internal_static_MusicGameStartToPlayOthersBeatmapRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MusicGameStartToPlayOthersBeatmapRspOuterClass.internal_static_MusicGameStartToPlayOthersBeatmapRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameStartToPlayOthersBeatmapRsp.class, Builder.class);
            }
            
            private Builder() {
                this.unknownEnum1_ = 0;
                this.aMNODOLNOIM_ = GeneratedMessageV3.emptyLongList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.unknownEnum1_ = 0;
                this.aMNODOLNOIM_ = GeneratedMessageV3.emptyLongList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MusicGameStartToPlayOthersBeatmapRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.unknownEnum1_ = 0;
                this.aMNODOLNOIM_ = GeneratedMessageV3.emptyLongList();
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MusicGameStartToPlayOthersBeatmapRspOuterClass.internal_static_MusicGameStartToPlayOthersBeatmapRsp_descriptor;
            }
            
            @Override
            public MusicGameStartToPlayOthersBeatmapRsp getDefaultInstanceForType() {
                return MusicGameStartToPlayOthersBeatmapRsp.getDefaultInstance();
            }
            
            @Override
            public MusicGameStartToPlayOthersBeatmapRsp build() {
                final MusicGameStartToPlayOthersBeatmapRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MusicGameStartToPlayOthersBeatmapRsp buildPartial() {
                final MusicGameStartToPlayOthersBeatmapRsp result = new MusicGameStartToPlayOthersBeatmapRsp(this);
                final int from_bitField0_ = this.bitField0_;
                result.retcode_ = this.retcode_;
                result.unknownEnum1_ = this.unknownEnum1_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.aMNODOLNOIM_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.aMNODOLNOIM_ = this.aMNODOLNOIM_;
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
                if (other instanceof MusicGameStartToPlayOthersBeatmapRsp) {
                    return this.mergeFrom((MusicGameStartToPlayOthersBeatmapRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MusicGameStartToPlayOthersBeatmapRsp other) {
                if (other == MusicGameStartToPlayOthersBeatmapRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.unknownEnum1_ != 0) {
                    this.setUnknownEnum1Value(other.getUnknownEnum1Value());
                }
                if (!other.aMNODOLNOIM_.isEmpty()) {
                    if (this.aMNODOLNOIM_.isEmpty()) {
                        this.aMNODOLNOIM_ = other.aMNODOLNOIM_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureAMNODOLNOIMIsMutable();
                        this.aMNODOLNOIM_.addAll(other.aMNODOLNOIM_);
                    }
                    this.onChanged();
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
                MusicGameStartToPlayOthersBeatmapRsp parsedMessage = null;
                try {
                    parsedMessage = MusicGameStartToPlayOthersBeatmapRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MusicGameStartToPlayOthersBeatmapRsp)e.getUnfinishedMessage();
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
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnknownEnum1Value() {
                return this.unknownEnum1_;
            }
            
            public Builder setUnknownEnum1Value(final int value) {
                this.unknownEnum1_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum getUnknownEnum1() {
                final MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum result = MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.valueOf(this.unknownEnum1_);
                return (result == null) ? MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.UNRECOGNIZED : result;
            }
            
            public Builder setUnknownEnum1(final MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.unknownEnum1_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearUnknownEnum1() {
                this.unknownEnum1_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureAMNODOLNOIMIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.aMNODOLNOIM_ = GeneratedMessageV3.mutableCopy(this.aMNODOLNOIM_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Long> getAMNODOLNOIMList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Long>)this.aMNODOLNOIM_) : this.aMNODOLNOIM_;
            }
            
            @Override
            public int getAMNODOLNOIMCount() {
                return this.aMNODOLNOIM_.size();
            }
            
            @Override
            public long getAMNODOLNOIM(final int index) {
                return this.aMNODOLNOIM_.getLong(index);
            }
            
            public Builder setAMNODOLNOIM(final int index, final long value) {
                this.ensureAMNODOLNOIMIsMutable();
                this.aMNODOLNOIM_.setLong(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addAMNODOLNOIM(final long value) {
                this.ensureAMNODOLNOIMIsMutable();
                this.aMNODOLNOIM_.addLong(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllAMNODOLNOIM(final Iterable<? extends Long> values) {
                this.ensureAMNODOLNOIMIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.aMNODOLNOIM_);
                this.onChanged();
                return this;
            }
            
            public Builder clearAMNODOLNOIM() {
                this.aMNODOLNOIM_ = GeneratedMessageV3.emptyLongList();
                this.bitField0_ &= 0xFFFFFFFE;
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
    
    public interface MusicGameStartToPlayOthersBeatmapRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        int getUnknownEnum1Value();
        
        MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum getUnknownEnum1();
        
        List<Long> getAMNODOLNOIMList();
        
        int getAMNODOLNOIMCount();
        
        long getAMNODOLNOIM(final int p0);
    }
}
