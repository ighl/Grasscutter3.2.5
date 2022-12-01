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

public final class MusicGameGetBeatmapRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_MusicGameGetBeatmapRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MusicGameGetBeatmapRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MusicGameGetBeatmapRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MusicGameGetBeatmapRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001cMusicGameGetBeatmapRsp.proto\u001a MusicGameGetBeatmapReqType.proto\u001a\u0012MusicBeatmap.proto\u001a\u0014MusicBriefInfo.proto\u001a\u001bMusicGameUnknown1Enum.proto\"\u008d\u0002\n\u0016MusicGameGetBeatmapRsp\u0012\u000f\n\u0007retcode\u0018\r \u0001(\u0005\u0012-\n\runknown_enum1\u0018\u0001 \u0001(\u000e2\u0016.MusicGameUnknown1Enum\u0012\u0016\n\u000emusic_share_id\u0018\u0005 \u0001(\u0004\u0012-\n\breq_type\u0018\u0002 \u0001(\u000e2\u001b.MusicGameGetBeatmapReqType\u0012%\n\fmusic_record\u0018\t \u0001(\u000b2\r.MusicBeatmapH\u0000\u0012,\n\u0010music_brief_info\u0018¹\u0007 \u0001(\u000b2\u000f.MusicBriefInfoH\u0001B\t\n\u0007beatmapB\f\n\nbrief_infoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MusicGameGetBeatmapRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { MusicGameGetBeatmapReqTypeOuterClass.getDescriptor(), MusicBeatmapOuterClass.getDescriptor(), MusicBriefInfoOuterClass.getDescriptor(), MusicGameUnknown1EnumOuterClass.getDescriptor() });
        internal_static_MusicGameGetBeatmapRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MusicGameGetBeatmapRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MusicGameGetBeatmapRspOuterClass.internal_static_MusicGameGetBeatmapRsp_descriptor, new String[] { "Retcode", "UnknownEnum1", "MusicShareId", "ReqType", "MusicRecord", "MusicBriefInfo", "Beatmap", "BriefInfo" });
        MusicGameGetBeatmapReqTypeOuterClass.getDescriptor();
        MusicBeatmapOuterClass.getDescriptor();
        MusicBriefInfoOuterClass.getDescriptor();
        MusicGameUnknown1EnumOuterClass.getDescriptor();
    }
    
    public static final class MusicGameGetBeatmapRsp extends GeneratedMessageV3 implements MusicGameGetBeatmapRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int beatmapCase_;
        private Object beatmap_;
        private int briefInfoCase_;
        private Object briefInfo_;
        public static final int RETCODE_FIELD_NUMBER = 13;
        private int retcode_;
        public static final int UNKNOWN_ENUM1_FIELD_NUMBER = 1;
        private int unknownEnum1_;
        public static final int MUSIC_SHARE_ID_FIELD_NUMBER = 5;
        private long musicShareId_;
        public static final int REQ_TYPE_FIELD_NUMBER = 2;
        private int reqType_;
        public static final int MUSIC_RECORD_FIELD_NUMBER = 9;
        public static final int MUSIC_BRIEF_INFO_FIELD_NUMBER = 953;
        private byte memoizedIsInitialized;
        private static final MusicGameGetBeatmapRsp DEFAULT_INSTANCE;
        private static final Parser<MusicGameGetBeatmapRsp> PARSER;
        
        private MusicGameGetBeatmapRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.beatmapCase_ = 0;
            this.briefInfoCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        private MusicGameGetBeatmapRsp() {
            this.beatmapCase_ = 0;
            this.briefInfoCase_ = 0;
            this.memoizedIsInitialized = -1;
            this.unknownEnum1_ = 0;
            this.reqType_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MusicGameGetBeatmapRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MusicGameGetBeatmapRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            final int rawValue = input.readEnum();
                            this.unknownEnum1_ = rawValue;
                            continue;
                        }
                        case 16: {
                            final int rawValue = input.readEnum();
                            this.reqType_ = rawValue;
                            continue;
                        }
                        case 40: {
                            this.musicShareId_ = input.readUInt64();
                            continue;
                        }
                        case 74: {
                            MusicBeatmapOuterClass.MusicBeatmap.Builder subBuilder = null;
                            if (this.beatmapCase_ == 9) {
                                subBuilder = ((MusicBeatmapOuterClass.MusicBeatmap)this.beatmap_).toBuilder();
                            }
                            this.beatmap_ = input.readMessage(MusicBeatmapOuterClass.MusicBeatmap.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((MusicBeatmapOuterClass.MusicBeatmap)this.beatmap_);
                                this.beatmap_ = subBuilder.buildPartial();
                            }
                            this.beatmapCase_ = 9;
                            continue;
                        }
                        case 104: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 7626: {
                            MusicBriefInfoOuterClass.MusicBriefInfo.Builder subBuilder2 = null;
                            if (this.briefInfoCase_ == 953) {
                                subBuilder2 = ((MusicBriefInfoOuterClass.MusicBriefInfo)this.briefInfo_).toBuilder();
                            }
                            this.briefInfo_ = input.readMessage(MusicBriefInfoOuterClass.MusicBriefInfo.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom((MusicBriefInfoOuterClass.MusicBriefInfo)this.briefInfo_);
                                this.briefInfo_ = subBuilder2.buildPartial();
                            }
                            this.briefInfoCase_ = 953;
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
            return MusicGameGetBeatmapRspOuterClass.internal_static_MusicGameGetBeatmapRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MusicGameGetBeatmapRspOuterClass.internal_static_MusicGameGetBeatmapRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameGetBeatmapRsp.class, Builder.class);
        }
        
        @Override
        public BeatmapCase getBeatmapCase() {
            return BeatmapCase.forNumber(this.beatmapCase_);
        }
        
        @Override
        public BriefInfoCase getBriefInfoCase() {
            return BriefInfoCase.forNumber(this.briefInfoCase_);
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
        public int getReqTypeValue() {
            return this.reqType_;
        }
        
        @Override
        public MusicGameGetBeatmapReqTypeOuterClass.MusicGameGetBeatmapReqType getReqType() {
            final MusicGameGetBeatmapReqTypeOuterClass.MusicGameGetBeatmapReqType result = MusicGameGetBeatmapReqTypeOuterClass.MusicGameGetBeatmapReqType.valueOf(this.reqType_);
            return (result == null) ? MusicGameGetBeatmapReqTypeOuterClass.MusicGameGetBeatmapReqType.UNRECOGNIZED : result;
        }
        
        @Override
        public boolean hasMusicRecord() {
            return this.beatmapCase_ == 9;
        }
        
        @Override
        public MusicBeatmapOuterClass.MusicBeatmap getMusicRecord() {
            if (this.beatmapCase_ == 9) {
                return (MusicBeatmapOuterClass.MusicBeatmap)this.beatmap_;
            }
            return MusicBeatmapOuterClass.MusicBeatmap.getDefaultInstance();
        }
        
        @Override
        public MusicBeatmapOuterClass.MusicBeatmapOrBuilder getMusicRecordOrBuilder() {
            if (this.beatmapCase_ == 9) {
                return (MusicBeatmapOuterClass.MusicBeatmap)this.beatmap_;
            }
            return MusicBeatmapOuterClass.MusicBeatmap.getDefaultInstance();
        }
        
        @Override
        public boolean hasMusicBriefInfo() {
            return this.briefInfoCase_ == 953;
        }
        
        @Override
        public MusicBriefInfoOuterClass.MusicBriefInfo getMusicBriefInfo() {
            if (this.briefInfoCase_ == 953) {
                return (MusicBriefInfoOuterClass.MusicBriefInfo)this.briefInfo_;
            }
            return MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
        }
        
        @Override
        public MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder getMusicBriefInfoOrBuilder() {
            if (this.briefInfoCase_ == 953) {
                return (MusicBriefInfoOuterClass.MusicBriefInfo)this.briefInfo_;
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
                output.writeEnum(1, this.unknownEnum1_);
            }
            if (this.reqType_ != MusicGameGetBeatmapReqTypeOuterClass.MusicGameGetBeatmapReqType.MusicGameGetBeatmapReqType_u1.getNumber()) {
                output.writeEnum(2, this.reqType_);
            }
            if (this.musicShareId_ != 0L) {
                output.writeUInt64(5, this.musicShareId_);
            }
            if (this.beatmapCase_ == 9) {
                output.writeMessage(9, (MessageLite)this.beatmap_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(13, this.retcode_);
            }
            if (this.briefInfoCase_ == 953) {
                output.writeMessage(953, (MessageLite)this.briefInfo_);
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
                size += CodedOutputStream.computeEnumSize(1, this.unknownEnum1_);
            }
            if (this.reqType_ != MusicGameGetBeatmapReqTypeOuterClass.MusicGameGetBeatmapReqType.MusicGameGetBeatmapReqType_u1.getNumber()) {
                size += CodedOutputStream.computeEnumSize(2, this.reqType_);
            }
            if (this.musicShareId_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(5, this.musicShareId_);
            }
            if (this.beatmapCase_ == 9) {
                size += CodedOutputStream.computeMessageSize(9, (MessageLite)this.beatmap_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(13, this.retcode_);
            }
            if (this.briefInfoCase_ == 953) {
                size += CodedOutputStream.computeMessageSize(953, (MessageLite)this.briefInfo_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MusicGameGetBeatmapRsp)) {
                return super.equals(obj);
            }
            final MusicGameGetBeatmapRsp other = (MusicGameGetBeatmapRsp)obj;
            if (this.getRetcode() != other.getRetcode()) {
                return false;
            }
            if (this.unknownEnum1_ != other.unknownEnum1_) {
                return false;
            }
            if (this.getMusicShareId() != other.getMusicShareId()) {
                return false;
            }
            if (this.reqType_ != other.reqType_) {
                return false;
            }
            if (!this.getBeatmapCase().equals(other.getBeatmapCase())) {
                return false;
            }
            switch (this.beatmapCase_) {
                case 9: {
                    if (!this.getMusicRecord().equals(other.getMusicRecord())) {
                        return false;
                    }
                    break;
                }
            }
            if (!this.getBriefInfoCase().equals(other.getBriefInfoCase())) {
                return false;
            }
            switch (this.briefInfoCase_) {
                case 953: {
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
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.unknownEnum1_;
            hash = 37 * hash + 5;
            hash = 53 * hash + Internal.hashLong(this.getMusicShareId());
            hash = 37 * hash + 2;
            hash = 53 * hash + this.reqType_;
            switch (this.beatmapCase_) {
                case 9: {
                    hash = 37 * hash + 9;
                    hash = 53 * hash + this.getMusicRecord().hashCode();
                    break;
                }
            }
            switch (this.briefInfoCase_) {
                case 953: {
                    hash = 37 * hash + 953;
                    hash = 53 * hash + this.getMusicBriefInfo().hashCode();
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MusicGameGetBeatmapRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MusicGameGetBeatmapRsp.PARSER.parseFrom(data);
        }
        
        public static MusicGameGetBeatmapRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameGetBeatmapRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameGetBeatmapRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MusicGameGetBeatmapRsp.PARSER.parseFrom(data);
        }
        
        public static MusicGameGetBeatmapRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameGetBeatmapRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameGetBeatmapRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MusicGameGetBeatmapRsp.PARSER.parseFrom(data);
        }
        
        public static MusicGameGetBeatmapRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MusicGameGetBeatmapRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MusicGameGetBeatmapRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameGetBeatmapRsp.PARSER, input);
        }
        
        public static MusicGameGetBeatmapRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameGetBeatmapRsp.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameGetBeatmapRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameGetBeatmapRsp.PARSER, input);
        }
        
        public static MusicGameGetBeatmapRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MusicGameGetBeatmapRsp.PARSER, input, extensionRegistry);
        }
        
        public static MusicGameGetBeatmapRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameGetBeatmapRsp.PARSER, input);
        }
        
        public static MusicGameGetBeatmapRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MusicGameGetBeatmapRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MusicGameGetBeatmapRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MusicGameGetBeatmapRsp prototype) {
            return MusicGameGetBeatmapRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MusicGameGetBeatmapRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MusicGameGetBeatmapRsp getDefaultInstance() {
            return MusicGameGetBeatmapRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<MusicGameGetBeatmapRsp> parser() {
            return MusicGameGetBeatmapRsp.PARSER;
        }
        
        @Override
        public Parser<MusicGameGetBeatmapRsp> getParserForType() {
            return MusicGameGetBeatmapRsp.PARSER;
        }
        
        @Override
        public MusicGameGetBeatmapRsp getDefaultInstanceForType() {
            return MusicGameGetBeatmapRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MusicGameGetBeatmapRsp();
            PARSER = new AbstractParser<MusicGameGetBeatmapRsp>() {
                @Override
                public MusicGameGetBeatmapRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MusicGameGetBeatmapRsp(input, extensionRegistry);
                }
            };
        }
        
        public enum BeatmapCase implements Internal.EnumLite, InternalOneOfEnum
        {
            MUSIC_RECORD(9), 
            BEATMAP_NOT_SET(0);
            
            private final int value;
            
            private BeatmapCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static BeatmapCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static BeatmapCase forNumber(final int value) {
                switch (value) {
                    case 9: {
                        return BeatmapCase.MUSIC_RECORD;
                    }
                    case 0: {
                        return BeatmapCase.BEATMAP_NOT_SET;
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
            
            private static /* synthetic */ BeatmapCase[] value() {
                return new BeatmapCase[] { BeatmapCase.MUSIC_RECORD, BeatmapCase.BEATMAP_NOT_SET };
            }
            
            
        }
        
        public enum BriefInfoCase implements Internal.EnumLite, InternalOneOfEnum
        {
            MUSIC_BRIEF_INFO(953), 
            BRIEFINFO_NOT_SET(0);
            
            private final int value;
            
            private BriefInfoCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static BriefInfoCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static BriefInfoCase forNumber(final int value) {
                switch (value) {
                    case 953: {
                        return BriefInfoCase.MUSIC_BRIEF_INFO;
                    }
                    case 0: {
                        return BriefInfoCase.BRIEFINFO_NOT_SET;
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
            
            private static /* synthetic */ BriefInfoCase[] value() {
                return new BriefInfoCase[] { BriefInfoCase.MUSIC_BRIEF_INFO, BriefInfoCase.BRIEFINFO_NOT_SET };
            }
            
            
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MusicGameGetBeatmapRspOrBuilder
        {
            private int beatmapCase_;
            private Object beatmap_;
            private int briefInfoCase_;
            private Object briefInfo_;
            private int retcode_;
            private int unknownEnum1_;
            private long musicShareId_;
            private int reqType_;
            private SingleFieldBuilderV3<MusicBeatmapOuterClass.MusicBeatmap, MusicBeatmapOuterClass.MusicBeatmap.Builder, MusicBeatmapOuterClass.MusicBeatmapOrBuilder> musicRecordBuilder_;
            private SingleFieldBuilderV3<MusicBriefInfoOuterClass.MusicBriefInfo, MusicBriefInfoOuterClass.MusicBriefInfo.Builder, MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder> musicBriefInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MusicGameGetBeatmapRspOuterClass.internal_static_MusicGameGetBeatmapRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MusicGameGetBeatmapRspOuterClass.internal_static_MusicGameGetBeatmapRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(MusicGameGetBeatmapRsp.class, Builder.class);
            }
            
            private Builder() {
                this.beatmapCase_ = 0;
                this.briefInfoCase_ = 0;
                this.unknownEnum1_ = 0;
                this.reqType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.beatmapCase_ = 0;
                this.briefInfoCase_ = 0;
                this.unknownEnum1_ = 0;
                this.reqType_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MusicGameGetBeatmapRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.unknownEnum1_ = 0;
                this.musicShareId_ = 0L;
                this.reqType_ = 0;
                this.beatmapCase_ = 0;
                this.beatmap_ = null;
                this.briefInfoCase_ = 0;
                this.briefInfo_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MusicGameGetBeatmapRspOuterClass.internal_static_MusicGameGetBeatmapRsp_descriptor;
            }
            
            @Override
            public MusicGameGetBeatmapRsp getDefaultInstanceForType() {
                return MusicGameGetBeatmapRsp.getDefaultInstance();
            }
            
            @Override
            public MusicGameGetBeatmapRsp build() {
                final MusicGameGetBeatmapRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MusicGameGetBeatmapRsp buildPartial() {
                final MusicGameGetBeatmapRsp result = new MusicGameGetBeatmapRsp(this);
                result.retcode_ = this.retcode_;
                result.unknownEnum1_ = this.unknownEnum1_;
                result.musicShareId_ = this.musicShareId_;
                result.reqType_ = this.reqType_;
                if (this.beatmapCase_ == 9) {
                    if (this.musicRecordBuilder_ == null) {
                        result.beatmap_ = this.beatmap_;
                    }
                    else {
                        result.beatmap_ = this.musicRecordBuilder_.build();
                    }
                }
                if (this.briefInfoCase_ == 953) {
                    if (this.musicBriefInfoBuilder_ == null) {
                        result.briefInfo_ = this.briefInfo_;
                    }
                    else {
                        result.briefInfo_ = this.musicBriefInfoBuilder_.build();
                    }
                }
                result.beatmapCase_ = this.beatmapCase_;
                result.briefInfoCase_ = this.briefInfoCase_;
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
                if (other instanceof MusicGameGetBeatmapRsp) {
                    return this.mergeFrom((MusicGameGetBeatmapRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MusicGameGetBeatmapRsp other) {
                if (other == MusicGameGetBeatmapRsp.getDefaultInstance()) {
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
                if (other.reqType_ != 0) {
                    this.setReqTypeValue(other.getReqTypeValue());
                }
                switch (other.getBeatmapCase()) {
                    case MUSIC_RECORD: {
                        this.mergeMusicRecord(other.getMusicRecord());
                        break;
                    }
                }
                switch (other.getBriefInfoCase()) {
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
                MusicGameGetBeatmapRsp parsedMessage = null;
                try {
                    parsedMessage = MusicGameGetBeatmapRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MusicGameGetBeatmapRsp)e.getUnfinishedMessage();
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
            public BeatmapCase getBeatmapCase() {
                return BeatmapCase.forNumber(this.beatmapCase_);
            }
            
            public Builder clearBeatmap() {
                this.beatmapCase_ = 0;
                this.beatmap_ = null;
                this.onChanged();
                return this;
            }
            
            @Override
            public BriefInfoCase getBriefInfoCase() {
                return BriefInfoCase.forNumber(this.briefInfoCase_);
            }
            
            public Builder clearBriefInfo() {
                this.briefInfoCase_ = 0;
                this.briefInfo_ = null;
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
            public int getReqTypeValue() {
                return this.reqType_;
            }
            
            public Builder setReqTypeValue(final int value) {
                this.reqType_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public MusicGameGetBeatmapReqTypeOuterClass.MusicGameGetBeatmapReqType getReqType() {
                final MusicGameGetBeatmapReqTypeOuterClass.MusicGameGetBeatmapReqType result = MusicGameGetBeatmapReqTypeOuterClass.MusicGameGetBeatmapReqType.valueOf(this.reqType_);
                return (result == null) ? MusicGameGetBeatmapReqTypeOuterClass.MusicGameGetBeatmapReqType.UNRECOGNIZED : result;
            }
            
            public Builder setReqType(final MusicGameGetBeatmapReqTypeOuterClass.MusicGameGetBeatmapReqType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.reqType_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearReqType() {
                this.reqType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasMusicRecord() {
                return this.beatmapCase_ == 9;
            }
            
            @Override
            public MusicBeatmapOuterClass.MusicBeatmap getMusicRecord() {
                if (this.musicRecordBuilder_ == null) {
                    if (this.beatmapCase_ == 9) {
                        return (MusicBeatmapOuterClass.MusicBeatmap)this.beatmap_;
                    }
                    return MusicBeatmapOuterClass.MusicBeatmap.getDefaultInstance();
                }
                else {
                    if (this.beatmapCase_ == 9) {
                        return this.musicRecordBuilder_.getMessage();
                    }
                    return MusicBeatmapOuterClass.MusicBeatmap.getDefaultInstance();
                }
            }
            
            public Builder setMusicRecord(final MusicBeatmapOuterClass.MusicBeatmap value) {
                if (this.musicRecordBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.beatmap_ = value;
                    this.onChanged();
                }
                else {
                    this.musicRecordBuilder_.setMessage(value);
                }
                this.beatmapCase_ = 9;
                return this;
            }
            
            public Builder setMusicRecord(final MusicBeatmapOuterClass.MusicBeatmap.Builder builderForValue) {
                if (this.musicRecordBuilder_ == null) {
                    this.beatmap_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.musicRecordBuilder_.setMessage(builderForValue.build());
                }
                this.beatmapCase_ = 9;
                return this;
            }
            
            public Builder mergeMusicRecord(final MusicBeatmapOuterClass.MusicBeatmap value) {
                if (this.musicRecordBuilder_ == null) {
                    if (this.beatmapCase_ == 9 && this.beatmap_ != MusicBeatmapOuterClass.MusicBeatmap.getDefaultInstance()) {
                        this.beatmap_ = MusicBeatmapOuterClass.MusicBeatmap.newBuilder((MusicBeatmapOuterClass.MusicBeatmap)this.beatmap_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.beatmap_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.beatmapCase_ == 9) {
                        this.musicRecordBuilder_.mergeFrom(value);
                    }
                    this.musicRecordBuilder_.setMessage(value);
                }
                this.beatmapCase_ = 9;
                return this;
            }
            
            public Builder clearMusicRecord() {
                if (this.musicRecordBuilder_ == null) {
                    if (this.beatmapCase_ == 9) {
                        this.beatmapCase_ = 0;
                        this.beatmap_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.beatmapCase_ == 9) {
                        this.beatmapCase_ = 0;
                        this.beatmap_ = null;
                    }
                    this.musicRecordBuilder_.clear();
                }
                return this;
            }
            
            public MusicBeatmapOuterClass.MusicBeatmap.Builder getMusicRecordBuilder() {
                return this.getMusicRecordFieldBuilder().getBuilder();
            }
            
            @Override
            public MusicBeatmapOuterClass.MusicBeatmapOrBuilder getMusicRecordOrBuilder() {
                if (this.beatmapCase_ == 9 && this.musicRecordBuilder_ != null) {
                    return this.musicRecordBuilder_.getMessageOrBuilder();
                }
                if (this.beatmapCase_ == 9) {
                    return (MusicBeatmapOuterClass.MusicBeatmap)this.beatmap_;
                }
                return MusicBeatmapOuterClass.MusicBeatmap.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<MusicBeatmapOuterClass.MusicBeatmap, MusicBeatmapOuterClass.MusicBeatmap.Builder, MusicBeatmapOuterClass.MusicBeatmapOrBuilder> getMusicRecordFieldBuilder() {
                if (this.musicRecordBuilder_ == null) {
                    if (this.beatmapCase_ != 9) {
                        this.beatmap_ = MusicBeatmapOuterClass.MusicBeatmap.getDefaultInstance();
                    }
                    this.musicRecordBuilder_ = new SingleFieldBuilderV3<MusicBeatmapOuterClass.MusicBeatmap, MusicBeatmapOuterClass.MusicBeatmap.Builder, MusicBeatmapOuterClass.MusicBeatmapOrBuilder>((MusicBeatmapOuterClass.MusicBeatmap)this.beatmap_, this.getParentForChildren(), this.isClean());
                    this.beatmap_ = null;
                }
                this.beatmapCase_ = 9;
                this.onChanged();
                return this.musicRecordBuilder_;
            }
            
            @Override
            public boolean hasMusicBriefInfo() {
                return this.briefInfoCase_ == 953;
            }
            
            @Override
            public MusicBriefInfoOuterClass.MusicBriefInfo getMusicBriefInfo() {
                if (this.musicBriefInfoBuilder_ == null) {
                    if (this.briefInfoCase_ == 953) {
                        return (MusicBriefInfoOuterClass.MusicBriefInfo)this.briefInfo_;
                    }
                    return MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
                }
                else {
                    if (this.briefInfoCase_ == 953) {
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
                    this.briefInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.musicBriefInfoBuilder_.setMessage(value);
                }
                this.briefInfoCase_ = 953;
                return this;
            }
            
            public Builder setMusicBriefInfo(final MusicBriefInfoOuterClass.MusicBriefInfo.Builder builderForValue) {
                if (this.musicBriefInfoBuilder_ == null) {
                    this.briefInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.musicBriefInfoBuilder_.setMessage(builderForValue.build());
                }
                this.briefInfoCase_ = 953;
                return this;
            }
            
            public Builder mergeMusicBriefInfo(final MusicBriefInfoOuterClass.MusicBriefInfo value) {
                if (this.musicBriefInfoBuilder_ == null) {
                    if (this.briefInfoCase_ == 953 && this.briefInfo_ != MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance()) {
                        this.briefInfo_ = MusicBriefInfoOuterClass.MusicBriefInfo.newBuilder((MusicBriefInfoOuterClass.MusicBriefInfo)this.briefInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.briefInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    if (this.briefInfoCase_ == 953) {
                        this.musicBriefInfoBuilder_.mergeFrom(value);
                    }
                    this.musicBriefInfoBuilder_.setMessage(value);
                }
                this.briefInfoCase_ = 953;
                return this;
            }
            
            public Builder clearMusicBriefInfo() {
                if (this.musicBriefInfoBuilder_ == null) {
                    if (this.briefInfoCase_ == 953) {
                        this.briefInfoCase_ = 0;
                        this.briefInfo_ = null;
                        this.onChanged();
                    }
                }
                else {
                    if (this.briefInfoCase_ == 953) {
                        this.briefInfoCase_ = 0;
                        this.briefInfo_ = null;
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
                if (this.briefInfoCase_ == 953 && this.musicBriefInfoBuilder_ != null) {
                    return this.musicBriefInfoBuilder_.getMessageOrBuilder();
                }
                if (this.briefInfoCase_ == 953) {
                    return (MusicBriefInfoOuterClass.MusicBriefInfo)this.briefInfo_;
                }
                return MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
            }
            
            private SingleFieldBuilderV3<MusicBriefInfoOuterClass.MusicBriefInfo, MusicBriefInfoOuterClass.MusicBriefInfo.Builder, MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder> getMusicBriefInfoFieldBuilder() {
                if (this.musicBriefInfoBuilder_ == null) {
                    if (this.briefInfoCase_ != 953) {
                        this.briefInfo_ = MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
                    }
                    this.musicBriefInfoBuilder_ = new SingleFieldBuilderV3<MusicBriefInfoOuterClass.MusicBriefInfo, MusicBriefInfoOuterClass.MusicBriefInfo.Builder, MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder>((MusicBriefInfoOuterClass.MusicBriefInfo)this.briefInfo_, this.getParentForChildren(), this.isClean());
                    this.briefInfo_ = null;
                }
                this.briefInfoCase_ = 953;
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
    
    public interface MusicGameGetBeatmapRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        int getUnknownEnum1Value();
        
        MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum getUnknownEnum1();
        
        long getMusicShareId();
        
        int getReqTypeValue();
        
        MusicGameGetBeatmapReqTypeOuterClass.MusicGameGetBeatmapReqType getReqType();
        
        boolean hasMusicRecord();
        
        MusicBeatmapOuterClass.MusicBeatmap getMusicRecord();
        
        MusicBeatmapOuterClass.MusicBeatmapOrBuilder getMusicRecordOrBuilder();
        
        boolean hasMusicBriefInfo();
        
        MusicBriefInfoOuterClass.MusicBriefInfo getMusicBriefInfo();
        
        MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder getMusicBriefInfoOrBuilder();
        
        MusicGameGetBeatmapRsp.BeatmapCase getBeatmapCase();
        
        MusicGameGetBeatmapRsp.BriefInfoCase getBriefInfoCase();
    }
}
