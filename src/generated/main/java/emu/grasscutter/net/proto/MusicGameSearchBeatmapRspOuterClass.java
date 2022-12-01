// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractMessageLite;
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

public final class MusicGameSearchBeatmapRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_MusicGameSearchBeatmapRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MusicGameSearchBeatmapRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MusicGameSearchBeatmapRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MusicGameSearchBeatmapRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001fMusicGameSearchBeatmapRsp.proto\u001a\u0014MusicBriefInfo.proto\u001a\u001bMusicGameUnknown1Enum.proto\"¯\u0001\n\u0019MusicGameSearchBeatmapRsp\u0012\u000f\n\u0007retcode\u0018\t \u0001(\u0005\u0012-\n\runknown_enum1\u0018\u0003 \u0001(\u000e2\u0016.MusicGameUnknown1Enum\u0012\u0016\n\u000emusic_share_id\u0018\u0004 \u0001(\u0004\u0012+\n\u0010music_brief_info\u0018\u000b \u0001(\u000b2\u000f.MusicBriefInfoH\u0000B\r\n\u000bELBEIFGDBMMB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MusicGameSearchBeatmapRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MusicBriefInfoOuterClass.getDescriptor(), MusicGameUnknown1EnumOuterClass.getDescriptor() });
        internal_static_MusicGameSearchBeatmapRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MusicGameSearchBeatmapRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MusicGameSearchBeatmapRspOuterClass.internal_static_MusicGameSearchBeatmapRsp_descriptor, new String[] { "Retcode", "UnknownEnum1", "MusicShareId", "MusicBriefInfo", "ELBEIFGDBMM" });
        MusicBriefInfoOuterClass.getDescriptor();
        MusicGameUnknown1EnumOuterClass.getDescriptor();
    }
    
    public static final class MusicGameSearchBeatmapRsp extends GeneratedMessageV3 implements MusicGameSearchBeatmapRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int eLBEIFGDBMMCase_;
        private Object eLBEIFGDBMM_;
        public static final int RETCODE_FIELD_NUMBER = 9;
        private int retcode_;
        public static final int UNKNOWN_ENUM1_FIELD_NUMBER = 3;
        private int unknownEnum1_;
        public static final int MUSIC_SHARE_ID_FIELD_NUMBER = 4;
        private long musicShareId_;
        public static final int MUSIC_BRIEF_INFO_FIELD_NUMBER = 11;
        private byte memoizedIsInitialized;
        private static final MusicGameSearchBeatmapRsp DEFAULT_INSTANCE;
        private static final Parser<MusicGameSearchBeatmapRsp> PARSER;
        
        private MusicGameSearchBeatmapRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.eLBEIFGDBMMCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        private MusicGameSearchBeatmapRsp() {
            this.eLBEIFGDBMMCase_ = 0;
            this.memoizedIsInitialized = -1;
            this.unknownEnum1_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MusicGameSearchBeatmapRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MusicGameSearchBeatmapRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 24: {
                            final int rawValue = input.readEnum();
                            this.unknownEnum1_ = rawValue;
                            continue;
                        }
                        case 32: {
                            this.musicShareId_ = input.readUInt64();
                            continue;
                        }
                        case 72: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 90: {
                            MusicBriefInfoOuterClass.MusicBriefInfo.Builder subBuilder = null;
                            if (this.eLBEIFGDBMMCase_ == 11) {
                                subBuilder = ((MusicBriefInfoOuterClass.MusicBriefInfo)this.eLBEIFGDBMM_).toBuilder();
                            }
                            this.eLBEIFGDBMM_ = input.readMessage(MusicBriefInfoOuterClass.MusicBriefInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((MusicBriefInfoOuterClass.MusicBriefInfo)this.eLBEIFGDBMM_);
                                this.eLBEIFGDBMM_ = subBuilder.buildPartial();
                            }
                            this.eLBEIFGDBMMCase_ = 11;
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
            return MusicGameSearchBeatmapRspOuterClass.internal_static_MusicGameSearchBeatmapRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MusicGameSearchBeatmapRspOuterClass.internal_static_MusicGameSearchBeatmapRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameSearchBeatmapRsp.class, Builder.class);
        }
        
        @Override
        public ELBEIFGDBMMCase getELBEIFGDBMMCase() {
            return ELBEIFGDBMMCase.forNumber(this.eLBEIFGDBMMCase_);
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
        public long getMusicShareId() {
            return this.musicShareId_;
        }
        
        @Override
        public boolean hasMusicBriefInfo() {
            return this.eLBEIFGDBMMCase_ == 11;
        }
        
        @Override
        public MusicBriefInfoOuterClass.MusicBriefInfo getMusicBriefInfo() {
            if (this.eLBEIFGDBMMCase_ == 11) {
                return (MusicBriefInfoOuterClass.MusicBriefInfo)this.eLBEIFGDBMM_;
            }
            return MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
        }
        
        @Override
        public MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder getMusicBriefInfoOrBuilder() {
            if (this.eLBEIFGDBMMCase_ == 11) {
                return (MusicBriefInfoOuterClass.MusicBriefInfo)this.eLBEIFGDBMM_;
            }
            return MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
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
            if (this.unknownEnum1_ != MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.MusicGameUnknown1Enum_NONE.getNumber()) {
                output.writeEnum(3, this.unknownEnum1_);
            }
            if (this.musicShareId_ != 0L) {
                output.writeUInt64(4, this.musicShareId_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(9, this.retcode_);
            }
            if (this.eLBEIFGDBMMCase_ == 11) {
                output.writeMessage(11, (MessageLite)this.eLBEIFGDBMM_);
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
            if (this.unknownEnum1_ != MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.MusicGameUnknown1Enum_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(3, this.unknownEnum1_);
            }
            if (this.musicShareId_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(4, this.musicShareId_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(9, this.retcode_);
            }
            if (this.eLBEIFGDBMMCase_ == 11) {
                size += CodedOutputStream.computeMessageSize(11, (MessageLite)this.eLBEIFGDBMM_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MusicGameSearchBeatmapRsp)) {
                return super.equals(obj);
            }
            final MusicGameSearchBeatmapRsp other = (MusicGameSearchBeatmapRsp)obj;
            if (this.getRetcode() != other.getRetcode()) {
                return false;
            }
            if (this.unknownEnum1_ != other.unknownEnum1_) {
                return false;
            }
            if (this.getMusicShareId() != other.getMusicShareId()) {
                return false;
            }
            if (!this.getELBEIFGDBMMCase().equals(other.getELBEIFGDBMMCase())) {
                return false;
            }
            switch (this.eLBEIFGDBMMCase_) {
                case 11: {
                    if (!this.getMusicBriefInfo().equals(other.getMusicBriefInfo())) {
                        return false;
                    }
                    break;
                }
            }
            return this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.unknownEnum1_;
            hash = 37 * hash + 4;
            hash = 53 * hash + Internal.hashLong(this.getMusicShareId());
            switch (this.eLBEIFGDBMMCase_) {
                case 11: {
                    hash = 37 * hash + 11;
                    hash = 53 * hash + this.getMusicBriefInfo().hashCode();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MusicGameSearchBeatmapRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MusicGameSearchBeatmapRsp.PARSER.parseFrom(data);
        }
        
        public static MusicGameSearchBeatmapRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameSearchBeatmapRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameSearchBeatmapRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MusicGameSearchBeatmapRsp.PARSER.parseFrom(data);
        }
        
        public static MusicGameSearchBeatmapRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameSearchBeatmapRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameSearchBeatmapRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MusicGameSearchBeatmapRsp.PARSER.parseFrom(data);
        }
        
        public static MusicGameSearchBeatmapRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameSearchBeatmapRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameSearchBeatmapRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameSearchBeatmapRsp.PARSER, input);
        }
        
        public static MusicGameSearchBeatmapRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameSearchBeatmapRsp.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameSearchBeatmapRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameSearchBeatmapRsp.PARSER, input);
        }
        
        public static MusicGameSearchBeatmapRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameSearchBeatmapRsp.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameSearchBeatmapRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameSearchBeatmapRsp.PARSER, input);
        }
        
        public static MusicGameSearchBeatmapRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameSearchBeatmapRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MusicGameSearchBeatmapRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MusicGameSearchBeatmapRsp prototype) {
            return MusicGameSearchBeatmapRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MusicGameSearchBeatmapRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MusicGameSearchBeatmapRsp getDefaultInstance() {
            return MusicGameSearchBeatmapRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<MusicGameSearchBeatmapRsp> parser() {
            return MusicGameSearchBeatmapRsp.PARSER;
        }
        
        @Override
        public Parser<MusicGameSearchBeatmapRsp> getParserForType() {
            return MusicGameSearchBeatmapRsp.PARSER;
        }
        
        @Override
        public MusicGameSearchBeatmapRsp getDefaultInstanceForType() {
            return MusicGameSearchBeatmapRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MusicGameSearchBeatmapRsp();
            PARSER = new AbstractParser<MusicGameSearchBeatmapRsp>() {
                @Override
                public MusicGameSearchBeatmapRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MusicGameSearchBeatmapRsp(input, extensionRegistry);
                }
            };
        }
        
        public enum ELBEIFGDBMMCase implements Internal.EnumLite, InternalOneOfEnum
        {
            MUSIC_BRIEF_INFO(11), 
            ELBEIFGDBMM_NOT_SET(0);
            
            private final int value;
            
            private ELBEIFGDBMMCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static ELBEIFGDBMMCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static ELBEIFGDBMMCase forNumber(final int value) {
                switch (value) {
                    case 11: {
                        return ELBEIFGDBMMCase.MUSIC_BRIEF_INFO;
                    }
                    case 0: {
                        return ELBEIFGDBMMCase.ELBEIFGDBMM_NOT_SET;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            @Override
            public int getNumber() {
                return this.value;
            }
            
            private static /* synthetic */ ELBEIFGDBMMCase[] value() {
                return new ELBEIFGDBMMCase[] { ELBEIFGDBMMCase.MUSIC_BRIEF_INFO, ELBEIFGDBMMCase.ELBEIFGDBMM_NOT_SET };
            }
            
            
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MusicGameSearchBeatmapRspOrBuilder
        {
            private int eLBEIFGDBMMCase_;
            private Object eLBEIFGDBMM_;
            private int retcode_;
            private int unknownEnum1_;
            private long musicShareId_;
            private SingleFieldBuilderV3<MusicBriefInfoOuterClass.MusicBriefInfo, MusicBriefInfoOuterClass.MusicBriefInfo.Builder, MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder> musicBriefInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MusicGameSearchBeatmapRspOuterClass.internal_static_MusicGameSearchBeatmapRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MusicGameSearchBeatmapRspOuterClass.internal_static_MusicGameSearchBeatmapRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameSearchBeatmapRsp.class, Builder.class);
            }
            
            private Builder() {
                this.eLBEIFGDBMMCase_ = 0;
                this.unknownEnum1_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.eLBEIFGDBMMCase_ = 0;
                this.unknownEnum1_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MusicGameSearchBeatmapRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.unknownEnum1_ = 0;
                this.musicShareId_ = 0L;
                this.eLBEIFGDBMMCase_ = 0;
                this.eLBEIFGDBMM_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MusicGameSearchBeatmapRspOuterClass.internal_static_MusicGameSearchBeatmapRsp_descriptor;
            }
            
            @Override
            public MusicGameSearchBeatmapRsp getDefaultInstanceForType() {
                return MusicGameSearchBeatmapRsp.getDefaultInstance();
            }
            
            @Override
            public MusicGameSearchBeatmapRsp build() {
                final MusicGameSearchBeatmapRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MusicGameSearchBeatmapRsp buildPartial() {
                final MusicGameSearchBeatmapRsp result = new MusicGameSearchBeatmapRsp(this);
                result.retcode_ = this.retcode_;
                result.unknownEnum1_ = this.unknownEnum1_;
                result.musicShareId_ = this.musicShareId_;
                if (this.eLBEIFGDBMMCase_ == 11) {
                    if (this.musicBriefInfoBuilder_ == null) {
                        result.eLBEIFGDBMM_ = this.eLBEIFGDBMM_;
                    }
                    else {
                        result.eLBEIFGDBMM_ = this.musicBriefInfoBuilder_.build();
                    }
                }
                result.eLBEIFGDBMMCase_ = this.eLBEIFGDBMMCase_;
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
                if (other instanceof MusicGameSearchBeatmapRsp) {
                    return this.mergeFrom((MusicGameSearchBeatmapRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MusicGameSearchBeatmapRsp other) {
                if (other == MusicGameSearchBeatmapRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.unknownEnum1_ != 0) {
                    this.setUnknownEnum1Value(other.getUnknownEnum1Value());
                }
                if (other.getMusicShareId() != 0L) {
                    this.setMusicShareId(other.getMusicShareId());
                }
                switch (other.getELBEIFGDBMMCase()) {
                    case MUSIC_BRIEF_INFO: {
                        this.mergeMusicBriefInfo(other.getMusicBriefInfo());
                        break;
                    }
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
                MusicGameSearchBeatmapRsp parsedMessage = null;
                try {
                    parsedMessage = MusicGameSearchBeatmapRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MusicGameSearchBeatmapRsp)e.getUnfinishedMessage();
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
            public ELBEIFGDBMMCase getELBEIFGDBMMCase() {
                return ELBEIFGDBMMCase.forNumber(this.eLBEIFGDBMMCase_);
            }
            
            public Builder clearELBEIFGDBMM() {
                this.eLBEIFGDBMMCase_ = 0;
                this.eLBEIFGDBMM_ = null;
                this.onChanged();
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
            
            @Override
            public long getMusicShareId() {
                return this.musicShareId_;
            }
            
            public Builder setMusicShareId(final long value) {
                this.musicShareId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearMusicShareId() {
                this.musicShareId_ = 0L;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasMusicBriefInfo() {
                return this.eLBEIFGDBMMCase_ == 11;
            }
            
            @Override
            public MusicBriefInfoOuterClass.MusicBriefInfo getMusicBriefInfo() {
                if (this.musicBriefInfoBuilder_ == null) {
                    if (this.eLBEIFGDBMMCase_ == 11) {
                        return (MusicBriefInfoOuterClass.MusicBriefInfo)this.eLBEIFGDBMM_;
                    }
                    return MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
                }
                else {
                    if (this.eLBEIFGDBMMCase_ == 11) {
                        return this.musicBriefInfoBuilder_.getMessage();
                    }
                    return MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
                }
            }
            
            public Builder setMusicBriefInfo(final MusicBriefInfoOuterClass.MusicBriefInfo value) {
                if (this.musicBriefInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.eLBEIFGDBMM_ = value;
                    this.onChanged();
                }
                else {
                    this.musicBriefInfoBuilder_.setMessage(value);
                }
                this.eLBEIFGDBMMCase_ = 11;
                return this;
            }
            
            public Builder setMusicBriefInfo(final MusicBriefInfoOuterClass.MusicBriefInfo.Builder builderForValue) {
                if (this.musicBriefInfoBuilder_ == null) {
                    this.eLBEIFGDBMM_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.musicBriefInfoBuilder_.setMessage(builderForValue.build());
                }
                this.eLBEIFGDBMMCase_ = 11;
                return this;
            }
            
            public Builder mergeMusicBriefInfo(final MusicBriefInfoOuterClass.MusicBriefInfo value) {
                if (this.musicBriefInfoBuilder_ == null) {
                    if (this.eLBEIFGDBMMCase_ == 11 && this.eLBEIFGDBMM_ != MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance()) {
                        this.eLBEIFGDBMM_ = MusicBriefInfoOuterClass.MusicBriefInfo.newBuilder((MusicBriefInfoOuterClass.MusicBriefInfo)this.eLBEIFGDBMM_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.eLBEIFGDBMM_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.eLBEIFGDBMMCase_ == 11) {
                        this.musicBriefInfoBuilder_.mergeFrom(value);
                    }
                    this.musicBriefInfoBuilder_.setMessage(value);
                }
                this.eLBEIFGDBMMCase_ = 11;
                return this;
            }
            
            public Builder clearMusicBriefInfo() {
                if (this.musicBriefInfoBuilder_ == null) {
                    if (this.eLBEIFGDBMMCase_ == 11) {
                        this.eLBEIFGDBMMCase_ = 0;
                        this.eLBEIFGDBMM_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.eLBEIFGDBMMCase_ == 11) {
                        this.eLBEIFGDBMMCase_ = 0;
                        this.eLBEIFGDBMM_ = null;
                    }
                    this.musicBriefInfoBuilder_.clear();
                }
                return this;
            }
            
            public MusicBriefInfoOuterClass.MusicBriefInfo.Builder getMusicBriefInfoBuilder() {
                return this.getMusicBriefInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder getMusicBriefInfoOrBuilder() {
                if (this.eLBEIFGDBMMCase_ == 11 && this.musicBriefInfoBuilder_ != null) {
                    return this.musicBriefInfoBuilder_.getMessageOrBuilder();
                }
                if (this.eLBEIFGDBMMCase_ == 11) {
                    return (MusicBriefInfoOuterClass.MusicBriefInfo)this.eLBEIFGDBMM_;
                }
                return MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<MusicBriefInfoOuterClass.MusicBriefInfo, MusicBriefInfoOuterClass.MusicBriefInfo.Builder, MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder> getMusicBriefInfoFieldBuilder() {
                if (this.musicBriefInfoBuilder_ == null) {
                    if (this.eLBEIFGDBMMCase_ != 11) {
                        this.eLBEIFGDBMM_ = MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
                    }
                    this.musicBriefInfoBuilder_ = new SingleFieldBuilderV3<MusicBriefInfoOuterClass.MusicBriefInfo, MusicBriefInfoOuterClass.MusicBriefInfo.Builder, MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder>((MusicBriefInfoOuterClass.MusicBriefInfo)this.eLBEIFGDBMM_, this.getParentForChildren(), this.isClean());
                    this.eLBEIFGDBMM_ = null;
                }
                this.eLBEIFGDBMMCase_ = 11;
                this.onChanged();
                return this.musicBriefInfoBuilder_;
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
    
    public interface MusicGameSearchBeatmapRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        int getUnknownEnum1Value();
        
        MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum getUnknownEnum1();
        
        long getMusicShareId();
        
        boolean hasMusicBriefInfo();
        
        MusicBriefInfoOuterClass.MusicBriefInfo getMusicBriefInfo();
        
        MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder getMusicBriefInfoOrBuilder();
        
        MusicGameSearchBeatmapRsp.ELBEIFGDBMMCase getELBEIFGDBMMCase();
    }
}
